package com.assignment.question1;

public class Employee {
	 
    private String firstName;
    private String lastName;
    private Integer age;
 
    public Employee(String firstName, String lastName, Integer age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
 
    @Override
    public String toString() {
 
        return "firstName: "+ this.firstName +" | lastName: "+ this.lastName +" | age: "+this.age;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}   
}
