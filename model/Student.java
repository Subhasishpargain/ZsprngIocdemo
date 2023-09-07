package com.gl.ioc.model;

public class Student {

	private int age;
	private String name;
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Student(int age, String name, String email) {
		super();
		this.age = age;
		this.name = name;
		this.email = email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Age = " + age + ", Name=" + name+" Email="+email ;
	}
	
	
}

