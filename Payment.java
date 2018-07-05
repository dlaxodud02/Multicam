package test0704;

import java.util.Scanner;

public class Payment {
	public static void main(String[] args) {
		
		System.out.println("가격을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		// 44500
		
		int a = 10000;
		int e = 5000;
		int b = 1000;
		int c = 100;
		int d = 10;
		
		a= total/a;
		total = total - a*10000;
		e= total/e;
		total = total - e*5000;
		b= total/b;
		total = total - b*1000;
		c= total/c;
		total = total - c*100;
		d= total/d;
		total = total - d*10;
		
		System.out.printf("만원짜리%d장, 오천원짜리%d장, 천원짜리 %d장, 백원짜리 %d개 , 십원짜리 %d개 필요합니다.", a,e,b,c,d);
	}
}
