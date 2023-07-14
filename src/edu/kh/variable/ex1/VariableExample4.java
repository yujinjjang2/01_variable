package edu.kh.variable.ex1;

public class VariableExample4 {
	
	public static void main(String[] args) {
		// main method(메서드) : 자바 어플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드
		
		/* 강제 형변환
		 * - 기존 자료형을 원하는 자료형으로 강제 변환 시키는 것
		 * 
		 * 1) 값의 범위가 큰 자료형을 작은 자료형으로 변환할 때 사용
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을 때
		 * 
		 * * 강제 형변환 방법
		 * - 자료형을 변환 시키고 싶은 값 또는 변수 앞에 (자료형) 을 작성
		 * 
		 * ex) double temp = 3.14;
		 *     int num = (int) temp;
		 * 
		 */
		
		double temp = 3.14;
		int num = (int) temp; // Type mismatch: cannot convert from double to int
		
		System.out.println("temp : " + temp); // temp : 3.14
		System.out.println("num : " + num); // num : 3
		// 실수 -> 정수형 변환 시 소수점 버림 처리(데이터 손실)
		
		
		// int -> byte 강제 형변환
		int iNum = 290;
		//byte bNum = iNum; // Type mismatch: cannot convert from int to byte
		
		byte bNum = (byte) iNum;
		
		System.out.println(iNum); // 290
		System.out.println(bNum); // 34
		
		// 같은 정수형 끼리의 변환 시에도
		// 값의 범위 차이 때문에 데이터 손실이 발생
		
		
		
		// char -> int 강제 형변환
		char ch = 'A'; // 65
		
		int iNum2 = ch; // 자동 형변환 이용
		System.out.println(iNum2); // 65
		
		// 강제형변환 이용
		System.out.println( (int)ch ); // 65
		
		
		// int -> char 강제 형변환
		int iNum3 = 44033;
		System.out.println( iNum3 + "번째 문자 : " + (char)iNum3 ); // 44033번째 문자 : 각
		
		
		
	}

}
