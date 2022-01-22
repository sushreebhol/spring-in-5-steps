package com.test.spring.basics.springin5steps.looselycoupled;

import java.util.Arrays;

public class BinarySearchImpl {
	
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm){ 
		super();
		this.sortAlgorithm = sortAlgorithm; 
	}
	 
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(Arrays.toString(sortedNumber));
		
		return 3;
	}

}
