package test0704;

import java.util.Scanner;

public class FindMaxValue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int score;
		char out;
		char a = 'A';
		char b = 'B';
		char c = 'C';
		char f = 'F';

		System.out.println("자신의 점수를 입력하세요");

		score = scan.nextInt();

		out = (score > 90) ? a : (score > 80) ? b : (score > 70) ? c : f;

		System.out.printf("당신의 학점은 " + out);

	}
}
