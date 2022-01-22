package com.test.spring.basics.springin5steps.looselycoupled;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[]{7, 4, 3, 5} , 3);
		System.out.println("New changed code for git push"+result);
	}

}
