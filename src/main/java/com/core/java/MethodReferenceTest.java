package com.core.java;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 0, 8, 7);
		System.out.println("Array elements: ");
		values.forEach(System.out::println);

	}

}
