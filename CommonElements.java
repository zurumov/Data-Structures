// ********************************************************
// CCS2110 Lab 1 - Part 2 - Exercise 1
// Common elements of two arrays. Neither array has duplicates.
// ********************************************************
public class CommonElements
{
	// Count the work: add 1 every time two elements are compared.
	static long comparisons = 0;

	// TODO: print every element that appears in both a and b (if print is true)
	// and return how many there are. Add 1 to comparisons for EVERY a[i] == b[j] test.
	static int common(int[] a, int[] b, boolean print)
	{
		return 0;
	}

	public static void main(String[] args)
	{
		int[] array1 = { 1, 2, 5, 8, 9, 7, 10 };
		int[] array2 = { 0, 6, 1, 15, 6, 4, 7, 10, 2 };

		// Step 1: BEFORE running, write down how many comparisons you expect: ______
		comparisons = 0;
		common(array1, array2, true);
		System.out.println("comparisons: " + comparisons);

		// Step 2: bigger arrays. Predict each count before you run it.
		//   n = 1000: ______   n = 2000: ______   n = 4000: ______
		int[] sizes = { 1000, 2000, 4000 };
		for (int n : sizes)
		{
			int[] a = RandomArrays.distinct(n, 1);
			int[] b = RandomArrays.distinct(n, 2);
			comparisons = 0;
			int found = common(a, b, false);
			System.out.println("n = " + n + ": found " + found + ", comparisons " + comparisons);
		}
	}
}
