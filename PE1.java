public class PE1 {

	public static void main(String[] Args) {

		System.out.println(doCalc());

	}

	public static int doCalc() {
		int result = 0;

		for(int i = 3; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				result += i;
			}
		}

		return result;
	}
}