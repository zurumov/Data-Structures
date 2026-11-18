// ********************************************************
// CCS2110 Lab 1 - Part 2 - Exercise 2 (in class)
// Amicable numbers: two DIFFERENT numbers, each equal to the
// sum of the proper divisors of the other (220 and 284).
// ********************************************************
public class Amicable
{
	// Count the work: add 1 every time you test whether d divides n (n % d).
	static long checks = 0;

	// TODO: the sum of the proper divisors of n (every divisor except n itself).
	// Start with the simplest version: try every d from 1 to n-1.
	static long sumOfProperDivisors(int n)
	{
		return 0;
	}

	// TODO: true if a and b are amicable. Read the definition carefully.
	static boolean isAmicable(int a, int b)
	{
		return false;
	}

	public static void main(String[] args)
	{
		checks = 0;
		System.out.println("sum of proper divisors of 220 = " + sumOfProperDivisors(220)
				+ ", checks = " + checks);
		System.out.println("isAmicable(220, 284) = " + isAmicable(220, 284));
		System.out.println("isAmicable(6, 6)     = " + isAmicable(6, 6));

		// TODO (step 3): print every amicable pair (a, b) with a < b and a < LIMIT,
		// each pair once, and the total number of checks it took.
		int LIMIT = 10000;
	}
}
