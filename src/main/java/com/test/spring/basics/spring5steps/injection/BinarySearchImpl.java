package com.test.spring.basics.spring5steps.injection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	
	 @Autowired 
	 private SortAlgorithm sortAlgorithm;
	 
	
	//setter injection
	// private SortAlgorithm sortAlgorithm;
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * 
	 * 		this.sortAlgorithm = sortAlgorithm; 
	 * }
	 */
	 

	//Constructor injection
	
	// private SortAlgorithm sortAlgorithm;
	/*
	 * public BinarySearchImpl(SortAlgorithm sortAlgorithm){ 
	 * 		super();
	 * 		this.sortAlgorithm = sortAlgorithm; 
	 * }
	 */
	 
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumber = sortAlgorithm.sort(numbers);
		System.out.println(Arrays.toString(sortedNumber));
		
		//print two-dimensional array
		/*
		 * String[][] phones = {{"Apple", "iPhone"}, {"Samsung", "Galaxy"}, {"Sony",
		 * "Xperia"}}; System.out.println("Hot phones .. " + phones);
		 * System.out.println("Not hot? See again.." + Arrays.deepToString(phones));
		 */

			
		return 3;
	}

}
