// 사용자의 입력을 받아 원하는 단수의 구구단 출력하는 프로그램.

import java.util.Scanner;
public class Gugudan {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구구단 몇단을 할까요? : ");
		int a = scan.nextInt();
		int b = 1;
		if ( a < 10) {
			while (b < 10) {
				System.out.printf( "%d * %d = %d\n", a , b , a * b);
				b++;
			}
		} else {
			System.out.println ( "9단 까지만 합시다.") ;
		}
	}
}