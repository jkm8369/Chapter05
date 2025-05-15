package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException{

		//주 스트림
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedimg.jpg");
		
		//보조 스트림
		BufferedInputStream bin = new BufferedInputStream(in);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		System.out.println("스트림 준비 완료");
		
		System.out.println("복사 시작");
		while(true) {
			//int data = in.read();   //바보짓
			int data = bin.read();
			if(data == -1) {
				System.out.println("(-1)복사 끝");
				break;
			}
			//out.write(data);   //바보
			bout.write(data);
		}
		
		
		//스트림 정리
		bout.close();      //주 스트림도 close 해준다
		bin.close();       //보조 스트림도 close 해준다
		
		System.out.println("프로그램 종료");
		
	}

}
