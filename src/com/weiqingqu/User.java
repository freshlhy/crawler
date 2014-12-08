package com.weiqingqu;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class User {
	
	private static final Qiniu qiniu = new Qiniu();
	
	public static String birthday(int start, int end) {
		GregorianCalendar gc = new GregorianCalendar();

		int year = RandomUtils.nextInt(start, end);

		gc.set(Calendar.YEAR, year);

		int dayOfYear = RandomUtils.nextInt(1,
				gc.getActualMaximum(Calendar.DAY_OF_YEAR));

		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);

		return gc.get(Calendar.YEAR) + "-" + gc.get(Calendar.MONTH) + "-"
				+ gc.get(Calendar.DAY_OF_MONTH);
	}

	public static void main(String[] args) throws Exception {
		int[] operators = { 134, 135, 136, 137, 138, 139, 147, 150, 151, 152,
				157, 158, 159, 182, 187, 188, 130, 131, 132, 145, 155, 156,
				185, 186, 145, 133, 153, 180, 181, 189 };
		int[] placeCodes = { 110001, 110002, 110003, 110006, 130001, 130002,
				130004, 130012 };
		String[] nicknames = Arrays.nicknameList;
		String[] signatures = Arrays.signatureList;
		File file = new File("avatars");
		String[] extensions = { "jpg" };
		Collection<File> avatarFiles = FileUtils.listFiles(file, extensions, false);
		ArrayList<String> avatarPaths = new ArrayList<String>();
		for(File avatarFile : avatarFiles) {
			avatarPaths.add(avatarFile.getAbsolutePath());
		}
		
		HttpLocalClient http = new HttpLocalClient();
		for (int i = 0; i < nicknames.length; i++) {
			String nickname = nicknames[i];
			String signature = signatures[i];
			int gender = RandomUtils.nextInt(0, 2);
			String birthday = birthday(1984, 2001);
			String randomNumbers = RandomStringUtils.randomNumeric(8);
			String mobile = operators[RandomUtils.nextInt(0, operators.length)]
					+ randomNumbers;
			int placeCode = placeCodes[RandomUtils
					.nextInt(0, placeCodes.length)];
			
			String avatarPath = avatarPaths.get(i); 
			String avatar = qiniu.uploadFile(avatarPath, avatarPath);

			List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
			urlParameters
					.add(new BasicNameValuePair("user[nickname]", nickname));
			urlParameters.add(new BasicNameValuePair("user[signature]",
					signature));
			urlParameters.add(new BasicNameValuePair("user[gender]", String
					.valueOf(gender)));
			urlParameters
					.add(new BasicNameValuePair("user[birthday]", birthday));
			urlParameters.add(new BasicNameValuePair("user[mobile]", mobile));
			urlParameters.add(new BasicNameValuePair("user[place_id]", String
					.valueOf(placeCode)));
			urlParameters.add(new BasicNameValuePair("user[avatar]", avatar + "@1"));
			http.sendPost("http://192.168.186.150:3000/users", urlParameters);

			break;

		}
	}
}