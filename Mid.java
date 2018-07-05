package test0704;

import java.util.Scanner;

public class Mid {
	public static void main(String[] args) {
		
		System.out.println("알고싶은 중간값을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int mid,a,b,c,big1,big2,big3;
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		
	big1 = a>b? a: b;
	big2 = a>c? a: c;
	big3 = b>c? b: c;
	
	mid = (big1< big2)? ((big1< big3)? big1: big3): (big2<big3) ? big2: big3;
	
	System.out.println(mid);
	}
}
