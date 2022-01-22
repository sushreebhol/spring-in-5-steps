package com.test.spring.basics.springin5steps.tightlycoupled;

import java.util.Arrays;

public class BinarySearchImpl {
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		//BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		//int[] sortedNumber = bubbleSortAlgorithm.sort(numbers);
		
		QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
		int[] sortedNumber = quickSortAlgorithm.sort(numbers);
		
		System.out.println(Arrays.toString(sortedNumber));
		
		return 3;
	}

}
