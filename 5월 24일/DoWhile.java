import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		// while (false) {
			 // 문장 1
			// System.out.println();
		// }
// do while은 while이 true면 계속 반복된다. while이 false면 한번만 출력됨.
		Scanner scan = new Scanner(System.in);
		System.out.println("10을 나눌 수 입력하세요");
		
		int num ;
		do {
			num = scan.nextInt();
			if (num == 0) {
				System.out.println("0으로 나눌 수 없음");
			}
		} while (num == 0);
		System.out.println(10 / num);
	}
}