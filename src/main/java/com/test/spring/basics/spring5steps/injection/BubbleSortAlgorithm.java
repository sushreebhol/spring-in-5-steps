package com.test.spring.basics.spring5steps.injection;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		int[] a = new int[]{11, 4, 3};
		return a;
		
	}

}
