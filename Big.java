package test0704;

import java.util.Scanner;

public class Big {
	public static void main(String[] args) {
		
		System.out.println("세 수를 입력하시오");

		Scanner sc = new Scanner(System.in);
		
		int big,a,b,c;
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		big = (a> b)? ((a> c)? a: c): (b>c) ? b: c;
		
		System.out.println(big);
	}
}
