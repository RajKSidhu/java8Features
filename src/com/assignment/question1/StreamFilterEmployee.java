package com.assignment.question1;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterEmployee {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Ramesh", "Gupta", 55));
        empList.add(new Employee("Naresh", "Saini", 62));
        empList.add(new Employee("Varsha", "Rani", 25));
        empList.add(new Employee("Amar", "Singla", 77));
        
        // Find employees whose age is greater than 26 and sort on the basis of first Name
        empList.stream()
        		.filter(emp->emp.getAge() > 26)
                .sorted((emp1, emp2)->emp1.getFirstName().compareTo(emp2.getFirstName()))
                .forEach(System.out::println);
	}

}
