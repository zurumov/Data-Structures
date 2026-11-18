// ********************************************************
// CCS2110 Lab 1 - Part 2 - Exercise 3 (at home)
// Common elements again, but now array2 MAY contain duplicates.
// array1 still has none. Print each common element ONCE.
// ********************************************************
public class CommonWithDuplicates
{
	static long comparisons = 0;

	// TODO: print each element of a that also appears in b, exactly once.
	// Count every comparison, as in Exercise 1.
	static void printCommon(int[] a, int[] b)
	{
	}

	public static void main(String[] args)
	{
		int[] array1 = { 1, 2, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 1, 15, 6, 4, 7, 0, 10, 10, 2, 1 };

		comparisons = 0;
		printCommon(array1, array2);
		System.out.println();
		System.out.println("comparisons: " + comparisons);
	}
}
