package com.example.until;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalLogs {

	public static SimpleDateFormat sf = new SimpleDateFormat(
			"yyyy-MM-dd HH:ss:mm");

	public static void main(String[] args) {

		LocalLogs.info("d");
	}
	

	public static void info(String str) {
		BufferedWriter fw = null;
		try {
			Throwable throwable = new Throwable();
			StackTraceElement ste = throwable.getStackTrace()[1];
			File file = new File("/Users/hongxin.shao/Desktop/logcache.txt");
			//File file = new File("D://logs/log.txt");
			fw = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file, true), "UTF-8"));
			fw.append(
					sf.format(new Date(System.currentTimeMillis()))
							+ " [INFO] [" + ste.getClassName() + "."
							+ ste.getMethodName() + ":" + ste.getLineNumber()
							+ "] : ").append(str).append("\r\n");
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
