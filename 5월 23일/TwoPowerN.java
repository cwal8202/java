// 2의 제곱 수를 32개 나열하고 결과값을 확인해보세요
// 2 4 8 16 32 .......

public class TwoPowerN {
	public static void main(String[] agrs) {
		long x = 1;
		int count = 0;
		for (int i = 1; i <= 32; i++) {
			x *= 2;
			System.out.println(x);
			count++;
			System.out.println("몇번 " + count);
		}
	}
}