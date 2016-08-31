public class PE3 {
	public static void main(String[] Args) {
		System.out.println("Largest prime is: " + largestPrime(600851475143l));
	}

	public static long largestPrime(long num) {
		long result = 0;
		for(long i = 2; i <= num; i++) {
			if (num % i == 0) {
            	num /= i;
            	result = i;
            	i--;
            }
		}
		return result;
	}
}