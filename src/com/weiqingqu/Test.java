package com.weiqingqu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public class Test {

	public static void main(String[] args) throws IOException {
		File file = new File("avatars");
		String[] extensions = { "jpg" };
		Collection<File> avatars = FileUtils.listFiles(file, extensions, false);
		for (File avatar : avatars)
			System.out.println(avatar.getAbsolutePath());
	}

}
