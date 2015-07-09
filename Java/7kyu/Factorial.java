public class Factorial {
	public int factorial(int n) {
		if (n < 0 || n > 12)
		throw new IllegalArgumentException("Number should be 1 to 12.");
    int result = 1;
		if (n > 0 || n <= 12) {
			for (int i = n; i > 1; i--)
				result *= i;
		}
		return result;
	}
}