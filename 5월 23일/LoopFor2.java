public class LoopFor2 {
	public static void main(String[] args) {
		// 10 ~ 99 사이의 정수 중 10의 자리 수와 1의 자리수의 합이 7인 수만 출력하기. 
		for (int i = 10; i <= 99; i++) {
			int a = i / 10;
			int b = i % 10;
			if (a + b == 7) {
				System.out.println(i);
			}
		}
	}
}