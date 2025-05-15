package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException{

		/*
		PhoneDB.txt 파일을 읽는다  (MS949 방식으로 저장되어 있음)
		
		이효리, 010-2222-3333, 031-2323-4441 을 ,로 구분한다  --> 배열
		문제에 있는 형식으로 출력한다
		*/
	
		
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			
		}
		
		
		
		
		
		br.close();
		
		
		
		
		
		
		
		
		
		
	}

}
