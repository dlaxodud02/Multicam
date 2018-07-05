package test0704;

import java.util.Scanner;

public class Yunnyun {
	public static void main(String[] args) {
		
		System.out.println("윤년이 알고 싶은 년도를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		boolean out;
		
		out = (year%4 == 0) ? ((year%100 != 0)? true: (year%400 == 0 )? true : false): false;
	
	
	System.out.println(out);
	}
}
