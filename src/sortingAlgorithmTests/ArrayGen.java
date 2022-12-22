package sortingAlgorithmTests;

import java.util.*;

public class ArrayGen {
	// used with to shuffle elements.
	public final Random gen = new Random();

	public int[] reversedArray(int size) {
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			a[i] = (size - i);
		}

		return a;

	}

	public int[] randomizedArray(int size) {
		int[] a = new int[size];

		// Populate array
		for (int i = 0; i < size; i++) {
			a[i] = i + 1;
		}

		// Shuffle array using Knuth Shuffle
		while (size > 1) {
			int k = gen.nextInt(size--); // decrements after using
			int temp = a[size];
			a[size] = a[k];
			a[k] = temp;
		}

		return a;

	}

	public int[] fewUniqueArray(int size) {
		int[] a = new int[size];

		for (int i = 0; i < size; i++)
			a[i] = (int) (4 * Math.random()) + 1;

		return a;

	}

	public int[] nearlySortedArray(int size) {
		int[] a = new int[size];

		// create the array
		for (int i = 0; i < size; i++)
			a[i] = i + 1;

		// loosly shuffle the data by selecting groups of 3 elements
		// and randomly chosing which pairs to switch
		for (int i = 0; i < size; i += 3) {
			int ran = (int) (4 * Math.random());

			if ((ran == 0) && ((i + 1) < size)) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			} else if ((ran == 1) && ((i + 2) < size)) {
				int temp = a[i + 1];
				a[i + 1] = a[i + 2];
				a[i + 2] = temp;
			} else if ((ran == 2) && ((i + 2) < size)) {
				int temp = a[i];
				a[i] = a[i + 2];
				a[i + 2] = temp;
			}
		}

		return a;
	}

}