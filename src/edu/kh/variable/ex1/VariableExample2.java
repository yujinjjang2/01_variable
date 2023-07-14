package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		/* 자바 기본 자료형 8가지(암기)
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 */
		
		
		// 변수 선언 : 메모리에 값을 저장할 공간을 할당 하는 것.
		// 변수 값 대입(집어넣기) : 변수에 값을 집어 넣는 것.
		
		/*
		 * int iNum; // 선언
		 * iNum = 2; // 초기화
		 * int iNum = 2; // 선언과 동시에 초기화
		 */
		
		// * 카멜(낙타) 표기법
		// 연결되는 두 단어 중 후속단어의 첫 문자를 대문자로 표기
		
		boolean booleanData;
		// 메모리에 논리 값(t/f)을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 booleanData라고 부르겠다.
		
		booleanData = true; // booleanData 변수에 true 값을 집어 넣기
		System.out.println("booleanData : " + booleanData); // booleanData : true
		
		
		byte byteNumber = 127; // 128 넣는순간 에러
		// 메모리에 정수 값을 저장할 공간을 1byte 할당하고
		// 할당된 공간을 byteNumber라고 부르겠다.
		// 선언된 byteNumber변수에 처음으로 127을 집어넣음.
		// --> 초기화 : 처음 변수에 값을 대입
		
		System.out.println("byteNumber : " + byteNumber); // byteNumber : 127
		
		short shortNumber = 32767; // 변수 선언 및 초기화
		
		// 정수 자료형 기본형! (short, byte는 옛날 코드 잔재)
		int intNumber = 2147483647; // 변수 선언 및 초기화
   // 자료형  변수명  = 리터럴;
		// 프로그래밍에서는 대입되는 이 데이터(값 자체)를 리터럴 이라는 단어로도 표현합니다!
		
		// ** 리터럴 : 변수에 대입되거나 작성 되어지는 값 자체
		// + 자료형에 따라 리터럴 표기법이 다름.
		
		long longNumber = 10000000000L; // L 또는 소문자 l
		// The literal 10000000000 of type int is out of range
		// -> 100억 이라는 값은 int의 범위를 벗어났다! 21억 몇까지만 가능..
		// 뒤에 L을 붙여줌으로써 long 자료형인 것을 나타냄.
		
		
		float floatNumber = 1.2345f; // F 또는 소문자 f
		// 1.2345까지만 쓰면 에러남. 자료형 맨 앞글자인 f 붙여줌.
		
		double doubleNumber = 3.141592;
		// double이 실수형 중에서 기본형
		// (리터럴 표기법이 없는 실수는 double로 인식)
		// d를 뒤에 쓸 수는 있다 -> 3.141592d;
		// 실수형은 float, double 두 개밖에 없기 때문에
		// 자바는 double을 그냥 리터럴 표기법 안붙이고 쓰는애로 정함.
		
		
		// 문자형 리터럴 표기법 : '' (홑따옴표)
		// -> 문자 하나
		char ch = 'A';
		char ch2 = 66;
		
		/* char 자료형에 숫자가 대입될 수 있는 이유 ?
		 * - 컴퓨터에는 문자표가 존재하고 있는데
		 *   숫자에 따라 지정된 문자 모양이 매핑되어 있고
		 * 	 'B' 문자 그대로가 대입되면 변수에 숫자 66으로 변환되어 저장
		 *   -> 반대로 생각하면 변수에 애초에 66이라는 숫자를 저장하는 것이 가능!
		 * 
		 * 
		 */
				
		System.out.println("ch : " + ch); // ch : A
		System.out.println("ch2 : " + ch2); // ch2 : B
		
		
		// 변수 명명 규칙
		
		// 1. 대소문자 구분, 길이제한 X
		int abcdefg123456789;
		int abcdefG123456789; // G 다름
		
		// 2. 예약어 사용 X
		//double double;
		
		// 3. 숫자 시작 X
		//char 1abc;
		char a2bc;
		
		// 4. 특수문자 $, _만 사용 가능(하지만 쓰지 않는다)
		int $intNumber; // 문제는 없지만 개발자가 직접 이렇게 작성하진 않음
		int int_Number; // 자바는 카멜표기법 사용
						// _ 작성 표기법 DB에서 사용
						// MEMBER_NAME
		
		// 5. 카멜 표기법
		// 변수명 작성 시 여러 단어를 이어서 작성하는 경우
		// 띄어쓰지 않고 후속 단어 첫 글자를 대문자로 작성.
		char helloWorldAppleBananaTomato;
		
		
		// 6. 변수명은 언어를 가리지 않음. (하지만 쓰지 않음)
		int 정수1번;
		double 실수2번 = 3.14;
		System.out.println(실수2번);
		
		
		// ------------------------------------------------------------
		
		int number = 10;
		System.out.println("number : " + number); // number : 10
		
		number = 20; // 변수이므로 재대입 가능
		System.out.println("number : " + number); // number : 20
		
		

		final double PI_VALUE = 3.14; 
		//PI_VALUE = 2.32222; // 에러 ! 재대입 불가!
		
		
		/* 상수(항상 같은 수) :
		 * - 변수 한 종류
		 * - 한번 값이 대입되면 다른 값을 재대입할 수 없음!
		 * - 자료형 앞에 final 키워드를 작성
		 * 
		 * - 상수 명명 규칙 : 모두 대문자, 여러단어 작성 시 _ 사용
		 * 
		 * - 상수를 사용하는 경우
		 *  1) 변하면 안되는 고정된 값을 저장할 때
		 *  2) 특정한 값에 의미를 부여하는 경우
		 * 
		 */
		
		
		final int LEFT_MOVE = -1;
		final int RIGHT_MOVE = 1;
		
		
		
	}
}
