package test0704;

import java.util.Scanner;

public class Test_0704 {

	public static void main(String[] args) {

		System.out.println("월급을 입7력하세요");
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = a * 12;

		System.out.printf(" 1년치 월급은 %d 입니다" ,b);
	}
}
