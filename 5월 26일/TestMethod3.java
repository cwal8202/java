import java.util.*;

public class TestMethod3 { 
	public static int getSum(int a, int b) {// parameters. 개수(입력한 개수와 출력 개수 다르면 컴파일오류)
														 //타입(입력한 타입과 출력 타입이 같아야한다)
														//순서
		return a + b;
	}
			
	// 두 개 int 정수를 전달받아 곱 연산결과를 반환하는 메소드를 작성하고 호출해 반환값을 출력해보세요.
	public static int getMul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		int sum = getSum(30, 60);
		System.out.println(sum);
		
		System.out.println(getMul(10, 20));
		// System.out.println(a);

		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력");
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(getMul(a, b));
	}
}