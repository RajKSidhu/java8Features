package com.assignment.question2;

import java.util.Date;

public final class ImmutableEmployee {
	
	private final String name;
	private final Date dob;
	private final int age;
	
	// set values using constructor
	public ImmutableEmployee(final String name, final Date dob, final int age) {
		super();
		this.name= name;
		this.dob = dob;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableEmployee other = (ImmutableEmployee) obj;
		if (age != other.age)
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [name=" + name + ", dob=" + dob + ", age=" + age + "]";
	}
}
