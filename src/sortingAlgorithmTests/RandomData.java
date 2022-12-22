package sortingAlgorithmTests;

public class RandomData {

	public static ArrayGen a = new ArrayGen();
	public static StopWatch timer = new StopWatch();
	public static Sorts sorter = new Sorts();
	public static long[] results = new long[10];

	public static double average(long[] arr) {

		double sum = 0.0;
		for (int i = 0; i < 10; i++) {

			sum += (double) arr[i];
		}

		return sum / 10;

	}

	public static void main(String[] args) {

		// Bubble sort with random data
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10);
			timer.start();
			sorter.bubbleSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Bubble Sort 10: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100);
			timer.start();
			sorter.bubbleSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Bubble Sort 100: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(1000);
			timer.start();
			sorter.bubbleSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Bubble Sort 1000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10000);
			timer.start();
			sorter.bubbleSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Bubble Sort 10000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100000);
			timer.start();
			sorter.bubbleSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		System.out.println("Bubble Sort 100000: " + average(results));
		System.out.println();

		// Selection sort with random data

		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10);
			timer.start();
			sorter.selectSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Select Sort 10: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100);
			timer.start();
			sorter.selectSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Select Sort 100: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(1000);
			timer.start();
			sorter.selectSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Select Sort 1000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10000);
			timer.start();
			sorter.selectSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Select Sort 10000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100000);
			timer.start();
			sorter.selectSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Select Sort 100000: " + average(results));
		System.out.println();

		// Insertion sort with random data

		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10);
			timer.start();
			sorter.insertSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Insert Sort 10: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100);
			timer.start();
			sorter.insertSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Insert Sort 100: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(1000);
			timer.start();
			sorter.insertSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Insert Sort 1000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(10000);
			timer.start();
			sorter.insertSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Insert Sort 10000: " + average(results));
		
		for (int i = 0; i < 10; i++) {
			
			int arr[] = a.randomizedArray(100000);
			timer.start();
			sorter.insertSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}
		
		System.out.println("Insert Sort 100000: " + average(results));
		System.out.println();

		// Merge sort with random data
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(10);
			timer.start();
			sorter.mergeSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Merge Sort 10: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(100);
			timer.start();
			sorter.mergeSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Merge Sort 100: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(1000);
			timer.start();
			sorter.mergeSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Merge Sort 1000: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(10000);
			timer.start();
			sorter.mergeSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Merge Sort 10000: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(100000);
			timer.start();
			sorter.mergeSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Merge Sort 100000: " + average(results));
		System.out.println();
		
		// Quick sort with random data
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(10);
			timer.start();
			sorter.quickSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Quick Sort 10: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(100);
			timer.start();
			sorter.quickSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Quick Sort 100: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(1000);
			timer.start();
			sorter.quickSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Quick Sort 1000: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(10000);
			timer.start();
			sorter.quickSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Quick Sort 10000: " + average(results));
		
		for (int i = 0; i < 10; i++) {

			int arr[] = a.randomizedArray(100000);
			timer.start();
			sorter.quickSort(arr);
			timer.stop();
			results[i] = timer.getElapsedTime();
		}

		System.out.println("Quick Sort 100000: " + average(results));

	}

}
