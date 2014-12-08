package com.weiqingqu;

import org.apache.commons.codec.digest.DigestUtils;
import org.json.JSONException;

import com.qiniu.api.auth.AuthException;
import com.qiniu.api.auth.digest.Mac;
import com.qiniu.api.config.Config;
import com.qiniu.api.io.IoApi;
import com.qiniu.api.io.PutExtra;
import com.qiniu.api.io.PutRet;
import com.qiniu.api.rs.PutPolicy;

public class Qiniu {

	public Qiniu() {
		Config.ACCESS_KEY = "Aiak80_9YUxuJBI9fxyKx9Lgcs0wT3IdaDouYYpX";
		Config.SECRET_KEY = "2ihBOJUR241ngtw9IRRe7YKscnVWzkqLlWykK56K";
	}

	public String uploadFile(String src, String localFilePath) throws AuthException,
			JSONException {
		Mac mac = new Mac(Config.ACCESS_KEY, Config.SECRET_KEY);
		String bucketName = "weiqingqu";
		PutPolicy putPolicy = new PutPolicy(bucketName);
		String uptoken = putPolicy.token(mac);
		PutExtra extra = new PutExtra();
		String key = DigestUtils.md5Hex(src);
		PutRet ret = IoApi.putFile(uptoken, key, localFilePath, extra);
		return ret.getKey();
	}
}
