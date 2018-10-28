package com.core.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private String lastName;

	public Employee(int id, String name, String lastName) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}

}

public class LambdaExpressionTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(11, "John", "Cena"));
		employees.add(new Employee(22, "Smith", "Patel"));
		employees.add(new Employee(33, "Smith", "Khana"));
		employees.add(new Employee(44, "Ram", "Mishra"));
		/*
		 * Collections.sort(employees,new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee o1, Employee o2) { int flag
		 * =o1.getName().compareTo(o2.getName());
		 * 
		 * return flag;
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * });
		 */
		System.out.println("Before sorting :");
		employees.forEach(e -> System.out.println(e));

		// System.out.println("Before sorting:"+employees);

		Collections.sort(employees, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		System.out.println("After sorting:");
		employees.forEach(e -> System.out.println(e));
		// Compare by last name
		Comparator<Employee> byLastName = Comparator.comparing(e -> e.getLastName());
		Collections.sort(employees, byLastName);
		System.out.println(employees);

	}

}
