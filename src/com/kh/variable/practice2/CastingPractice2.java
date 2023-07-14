package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice2 {
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double input1 = sc.nextDouble();
		int input4 = (int) input1;
		
		System.out.print("영어 : ");
		double input2 = sc.nextDouble();
		int input5 = (int) input2;
		
		System.out.print("수학 : ");
		double input3 = sc.nextDouble();
		int input6 = (int) input3;
		
		System.out.printf("총점 : %d\n", input4 + input5 + input6);
		System.out.printf("평균 : %d\n", (input4 + input5 + input6) / 3);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double input1 = sc.nextDouble(); // 90.0
		
		System.out.print("영어 : ");
		double input2 = sc.nextDouble(); // 90.0
		
		System.out.print("수학 : ");
		double input3 = sc.nextDouble(); // 90.0
		
		System.out.printf("총점 : %d\n", (int)(input1 + input2 + input3)); // 총점 : 270
		System.out.printf("평균 : %d\n", (int)(input1 + input2 + input3)/3); // 평균 : 90
	}

}
