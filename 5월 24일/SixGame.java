// 2 ~ 9 까지의 무작위 수를 정하여
// 사용자가 해당하는 수의 배수를 순서대로 입력하게끔
// 틀릴 경우 종료

// 예) 랜덤 수가 6일 경우

// 사용자 입력
// 6 0 
// 12 0
// 18 0
// 21 x 종료
import java.util.Scanner;
import java.util.Random;


public class SixGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int a = random.nextInt(8) + 2;
		
		
		System.out.printf("%d의 배수를 적어라\n", b);
		
		// int result = 1;
		// for ( int i = 1;  ; i++) {
			// int input = scan.nextInt();
			// result = a * i;
			// if (result == input) {
			// System.out.print("O");
			// } else {
				// break;
			// }
		// } System.out.print("x");
		
		int result = 1;
		int i = 0;
		boolean x = true;
		while (x) { i++;
			int input = scan.nextInt();
			result = ran * i;
			if (result == input) {
			System.out.println("O");
			} else { x= false;
			}
		} System.out.println("X");
	}
}