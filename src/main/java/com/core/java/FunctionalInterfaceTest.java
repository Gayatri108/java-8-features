package com.core.java;

interface FunctionalInterface {
	int add(int a, int b);;;;;
}

class Test implements FunctionalInterface {

	@Override
	public int add(int a, int b) {

		return a + b;
	}

}

public class FunctionalInterfaceTest {
	public static void main(String[] args) {
		// Using implementation class
		FunctionalInterface interface1 = new Test();
		int sum = interface1.add(10, 20);
		System.out.println("Sum of two numbers using subclass implementation of functional interface:" + sum);

		// Using anonymous inner class
		FunctionalInterface functionalInterface = new FunctionalInterface() {

			@Override
			public int add(int a, int b) {

				return a + b;

			}
		};
		int sum1 = functionalInterface.add(30, 40);
		System.out.println("Sum of two numbers using annonymous inner class" + sum1);
		// Using lambda

		FunctionalInterface fuInterface = (a, b) -> (a + b);
		int sum3 = fuInterface.add(10, 50);
		System.out.println("Sum of two numbers using lambdas " + sum3);

	}

}
