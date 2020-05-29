package com.assignment.question2;

import java.util.Date;
import java.util.HashMap;

public class TestImmutable {

	public static void main(String[] args) {
		
		//Create a HashMap with key
        HashMap<ImmutableEmployee, String> map = new HashMap<ImmutableEmployee, String>();
        
        //Create key 1
        ImmutableEmployee employee = new ImmutableEmployee("Sachin", new Date(1984-04-04), 45);

        //Create key 2
        ImmutableEmployee employee2 = new ImmutableEmployee("Kuldeep", new Date(2000-05-05), 50);
          
        //Put key and value in map
        map.put(employee, employee.getName());
        map.put(employee2, employee2.getName());

        System.out.println(map.get(employee));
        System.out.println(map.get(employee2));
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());

	}

}
