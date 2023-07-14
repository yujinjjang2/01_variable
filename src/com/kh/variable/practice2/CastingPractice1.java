package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {
	
	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		char input1 = sc.nextLine().charAt(0);
		int input2 = input1;
		
		System.out.printf("A unicode : %d", input2);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		
		//String input = sc.next(); // A
		//char result = input.charAt(0);
		
		char result2 = sc.next().charAt(0);
		
		System.out.printf("%s unicode : %d", result2, (int)result2);
	}

}
