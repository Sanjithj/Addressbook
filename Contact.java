package com.bridgelabz;


public class Contact {
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	String email;
	int zipcode;
	long phone;
	public Contact(String firstName, String lastName, String address, String city, String state, String email, int zipcode, long phone)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
	    this.email=email;
		this.zipcode=zipcode;
		this.phone=phone;
	}
	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String toString() {
		return "Contact[firstName=" + firstName + ", lastName= " + lastName + ", address=" + address + ", city=" + city + ", state=" + state + ",email=" + email + ", zipcode=" + zipcode + ", phone=" + phone + "]";
		
	}
}





