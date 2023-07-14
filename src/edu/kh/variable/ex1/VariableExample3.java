package edu.kh.variable.ex1;

public class VariableExample3 {
	
	public static void main(String[] args) {
		
		/* 형변환 (Casting): 값의 자료형을 변환하는 것 (단, boolean 제외)
		 * 
		 * ** 형변환은 왜 필요할까?
		 * 컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능함.
		 * 다른 자료형과 연산 시 오류 발생.
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변환.
		 * 
		 * 자동 / 강제 형변환이 존재.
		 * 
		 */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : " + (num1 + num2)); // 자동 형변환 결과 : 13.5
		// 원래 에러가 발생해야 되지만 "자동 형변환" 덕분에 발생하지 않음.
		
		int i1 = 3;
		double d1 = i1;
		
		System.out.println("i1 : " + i1); // i1 : 3
		System.out.println("d1 : " + d1); // d1 : 3.0
		// double은 실수만 저장할 수 있는 자료형
		// 정수가 대입되는 연산이 수행되면
		// 정수 -> 실수로 자동 형변환
		
		System.out.println(d1 + num2); // double + double, 6.5
		
		
		// int -> long 형변환
		int i2 = 2_100_000_000; // 21억
		
		long l2 = 10_000_000_000L; // 100억
		
		long result2 = i2 + l2;
		//int + long -> long + long = long
		
		System.out.println("result2 : " + result2); // result2 : 12100000000
		
		
		// char -> int 형변환
		/* char 자료형은 문자형이지만 실제 저장하는 값은
		 * 0 부터 6만5천번 사이에 있는 숫자
		 */
		
		char ch3 = 'V';
		int i3 = ch3;
		
		System.out.println(i3); // 86
		
		char ch4 = '각';
		int i4 = ch4;
		
		System.out.println(i4); // 44033
		
		
		// 오버플로우 현상은 컴퓨터가 미리 예측할 수가 없다!!!
		// -> 개발자가 미리 예측해야함.
		
		int i6 = 2147483647; // int의 최대값
		int result6 = i6 + 1;
		System.out.println(result6); // -2147483648
		
	}

}
