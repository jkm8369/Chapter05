package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

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
		
		//리스트 만들기
		List<Person> pList = new ArrayList<Person>();
		
		//스트림 준비
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복 (파일 끝까지)
		while(true) {
			//파일에서 1줄을 읽는다
			String str = br.readLine();      //"이효리,010-2222-3333,031-2323-4441"
			
			//마지막이면 끝(탈출)
			if(str == null) {
				break;
			}
			
			//읽는줄에서 이름 hp company로 분리한다
			String[] sArray = str.split(",");
			
			//Person을 메모리에 올린다
			Person p = new Person(sArray[0], sArray[1], sArray[2]);
			
			//Person(주소)를 List에 추가한다
			pList.add(p);
			
		}
		
	
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		System.out.println("-----------------------------------");
		
		//이름만 출력
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).getName());
		}
		System.out.println("-----------------------------------");
		
		//첫번째 사람의 이름, 핸드폰
		//System.out.println(pList.get(0).getName());
		//System.out.println(pList.get(0).getHp());
		
		Person person = pList.get(0);
		System.out.println(person.getName());
		System.out.println(person.getHp());
		System.out.println(person.getCompany());
		
		Person pAdd = new Person("황일영", "010-3333-5151", "010-222-2222");
		pList.add(pAdd);
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		
		
		br.close();
		
		
		
		
		
		
		
		
		
		
		//Person을 메모리에 올리고 이름 hp company를 초기화한다
		
		//리스트에 Person 주소를 넣는다
		
		
		
		
		/*
		Person[] pArray = new Person[3];
		
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
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
		*/

		
	}

}
