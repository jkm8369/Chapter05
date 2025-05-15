package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException{

		//스트림 준비
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		System.out.println("스트림 준비완료");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사 시작");
		while(true) {
			//int data = in.read();
			int data =in.read(buff);
			
			System.out.println(data);
			
			if(data == -1) {
				System.out.println("(-1)복사 끝");
				break;
			}
			//out.write(data);
			out.write(buff);
		}
		
		
		
		//스트림 종료
		in.close();
		out.close();
		
		System.out.println("프로그램 종료");
	}

}
