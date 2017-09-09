package com.thelastlegacy.RestaurentSystem.model;

public class Waiter {

	private int waiterId;
	private String firstName;
	private String lastName;
	private int age;
	private String address;
	
	public Waiter(){}
	public Waiter(int waiterId, String firstName, String lastName, int age, String address) {
		this.waiterId = waiterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	public int getWaiterId() {
		return waiterId;
	}
	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
