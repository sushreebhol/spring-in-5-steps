package com.test.spring.basics.springin5steps.tightlycoupled;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl();
		int result = binarySearchImpl.binarySearch(new int[]{7, 4, 3, 5} , 3);
		System.out.println(result);
	}

}
