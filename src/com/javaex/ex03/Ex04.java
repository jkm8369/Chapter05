package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex04 {

	public static void main(String[] args) throws IOException{

		/*
		PhoneDB.txt 파일을 읽는다  (MS949 방식으로 저장되어 있음)
		
		이효리, 010-2222-3333, 031-2323-4441 을 ,로 구분한다  --> 배열
		
		//반복
		====> 리스트에 정리
		[0x111] [0x333] [0x888]
		
		0x111 name = 이효리, hp = 010-2222-3333, company = 031-2323-4441  ==> Person이라고 만든다
		
		
		for문으로 출력
		문제에 있는 형식으로 출력한다
		
		 */
		
		Person[] pArray = new Person[3];
		
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		/*
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			System.out.println(str);
			
		}
		*/
		
		
		for(int i=0; i<pArray.length; i++) {
			String str = br.readLine();
			String[] fInfo = str.split(",");
			
			String name = fInfo[0];
			String hp = fInfo[1];
			String company = fInfo[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
		
		}
		
		
		
		
		
		
		
		br.close();
		
	}

}
