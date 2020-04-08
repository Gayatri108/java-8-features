package com.core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(11, "John", "Cena"));
		employees.add(new Employee(22, "Smith", "Patel"));
		employees.add(new Employee(33, "Smith", "Khana"));
		employees.add(new Employee(44, "Ram", "Mishra"));
		Employee employee = employees.stream().findFirst().get();
		System.out.println(employee);
		long length = employees.stream().count();
		System.out.println("Length of the ArrayList: " + length);
		if (employees.stream().anyMatch((e) -> e.getName().equals("Ram"))) {
			System.out.println("Employee found");
		}
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 0, 8, 7);
		System.out.print("Array elements: ");
		values.forEach(i -> System.out.print(i + " "));
		System.out.println();

		System.out.print("printing only odd numbers::------");

		values.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.print(i + " "));
		System.out.println();

		Integer result = getResult(values);
		Integer result2 = getResultUsingStream(values);
		System.out.println("Result :" + result);
		System.out.println("With Stream:" + result2);
		// lambda expression
		Integer sum = values.stream().map(i -> i * 2).reduce(0, (d, e) -> d + e);
		System.out.println("With lambda:" + sum);

	}

	private final static Integer getResult(List<Integer> values) {
		int result = 0;
		for (Integer i : values) {
			result = result + (i * 2);
		}
		return result;

	}

	private final static Integer getResultUsingStream(List<Integer> values) {
		Stream s = values.stream();
		Stream map = s.map(function);
		Integer result = (Integer) map.reduce(0, b);
		return result;

	}

	static Function<Integer, Integer> function = new Function<Integer, Integer>() {

		@Override
		public Integer apply(Integer t) {

			return t * 2;
		}
	};
	static BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

		@Override
		public Integer apply(Integer t, Integer u) {

			return t + u;
		}

	};

}
