package com.weiqingqu;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class Parser {

	public static ArrayList<String> topic_ids = new ArrayList<String>(); 

	// The path of the folder that you want to save the images to
	private static final String folderPath = "./images";

	private static final Qiniu qiniu = new Qiniu();

	public static void main(String[] args) throws Exception {
		loadLinkIds();
		for (String topic_id : topic_ids) {
			String url = "http://news.jiecao.fm/client/article/detail.htm?v=2.6.2&&down=true&id="
					+ topic_id;		
			System.out.println(url);
			Document doc = Jsoup.connect(url).get();
			Elements article = doc.select("#js-article");
			Document article_doc = Jsoup.parseBodyFragment(article.html());
			Elements img = article_doc.getElementsByTag("img");
			for (Element el : img) {
				String src = el.absUrl("src");
				String localFilePath = getImage(src);
				String key = qiniu.uploadFile(src, localFilePath);
				el.attr("src", key + "@1");
			}
			
			System.out.println(article_doc.body().html());
			
			HttpLocalClient http = new HttpLocalClient();
			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters.add(new BasicNameValuePair("topic[body]", article_doc
					.body().html()));
			http.sendPost("http://192.168.186.150:3000/topics", urlParameters);

		}
	}

	private static String getImage(String src) throws IOException {
		int indexname = src.lastIndexOf("/");
		if (indexname == src.length()) {
			src = src.substring(1, indexname);
		}
		indexname = src.lastIndexOf("/");
		String name = src.substring(indexname, src.length());
		String localFilePath = folderPath + name;
		URL url = new URL(src);
		InputStream in = url.openStream();
		OutputStream out = new BufferedOutputStream(new FileOutputStream(
				localFilePath));
		for (int b; (b = in.read()) != -1;) {
			out.write(b);
		}
		out.close();
		in.close();

		return localFilePath;
	}

	private static void loadLinkIds() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("link_ids.txt"));
		try {
			String line = br.readLine();
			while (line != null) {
				topic_ids.add(line);
				line = br.readLine();
//				if(topic_ids.size() > 0) return;
			}
		} finally {
			br.close();
		}
	}

}
