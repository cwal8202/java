public class LoopFor1 {
	public static void main(String[] args) {
		// "반복"이라는 문자열 5번 출력하기 
		for (int i = 0; i < 5; i++) {
			System.out.println("출력");
		} // 세미콜론으로 구별되어있는 것중 제일 앞부분(선언부-선언하고 초기화)
			//두번째 : 조건부 treu or false 판별하는 조건부
			// true 면 중괄호 안으로 적용 된 후 마지막부분(증감식)으로 적용된다.
			// 증감식 적용 후 다시 '조건부 -> 증감식' 반복
		
		// for문은 반복을 몇번 할것인지를 숫자를 세면서 하는 표현들이 대부분이며
		// while은 ~~할때까지 계속 반복하는것이다.
		// for 문은 3구간이 다 안채워져도 동작한다. 
		// ex) 중간의 조건부가 공란이면 무한반복
		// ex) 선언을 먼저했다면 선언부는 공란이어도됨.
		// ex) 증감식부분도 공란이면 무한반복됨 - 조건에 충족하지 않아 계속 true 됨.
		// for문에서 선언부에 선언한 값은 for문이 끝나면 값을 불러올수 없다.
		
		//System.out.println(i);
		
		// 1부터 10까지 출력하기 (for);
		for (int i = 1; i < 11; i++) {
		 System.out.println(i);
		 }
		
		 //21부터 30까지의 3의 배수 출력하기
		 for (int i = 21; i < 31; i += 3) {
			System.out.println(i);
		 }
		
		// 30 29 28 ...20까지 역순 출력하기
		for (int i = 30; i > 19; i--) {
			System.out.println(i);
		}
		
		
		
		// // 기존 while 반복문
		// int i = 0;
		// while (i < 5) {
			// System.out.println("출력");
			// i++;
		// }
	}
}