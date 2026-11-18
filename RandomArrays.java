// ********************************************************
// CCS2110 Lab 1 - Part 2
// Makes test arrays for the counting experiments.
// (This file is complete. Do not change it.)
// ********************************************************
import java.util.Random;

public class RandomArrays
{
	// n DIFFERENT integers taken from 0 .. 2n-1, in random order.
	// The same seed always gives the same array, so everyone in the
	// lab gets the same numbers.
	public static int[] distinct(int n, long seed)
	{
		int[] pool = new int[2 * n];
		for (int i = 0; i < pool.length; i++)
			pool[i] = i;
		Random random = new Random(seed);
		for (int i = pool.length - 1; i > 0; i--)   // shuffle (Fisher-Yates)
		{
			int j = random.nextInt(i + 1);
			int tmp = pool[i];
			pool[i] = pool[j];
			pool[j] = tmp;
		}
		int[] result = new int[n];
		for (int i = 0; i < n; i++)
			result[i] = pool[i];
		return result;
	}
}
