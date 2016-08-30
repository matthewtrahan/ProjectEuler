public class PE2 {
	public static void main(String[] Args) {
		System.out.println(evenFib());
	}

	public static int evenFib() {
		int result = 0;
		int[] fib = new int[40];
		fib[0] = 0;
		fib[1] = 1;
		int i = 2;

		while(fib[i - 1] < 4000000) {
			fib[i] = fib[i - 1] + fib[i - 2];
			if(fib[i] % 2 == 0)
				result += fib[i];
			i++;
		}

		return result;
	}
}