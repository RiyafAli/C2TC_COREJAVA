package com.tns.day5.hierarchicalinheritance;

public class Person2 {
	private String name;
	private String city;

	public Person2() {
		System.out.println("Person class default constructor");
		name="Amit";
		city="Pune";
	}

	public Person2(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
}
