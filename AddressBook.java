package com.bridgelabz;

import java.util.Scanner;


public class AddressBook {
	
	public static ArrayList<Contact>addressBook = new ArrayList<Contact>();
	
	public Contact inputDetails() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first name: " + "");
		String firstName = scan.next();
		
		System.out.println("Enter the last name: " + "");
		String lastName = scan.next();
		
		System.out.println("Enter the address: ");
		String address = scan.next();
	
		System.out.println("Enter the city: ");
		String city = scan.next();
		
		System.out.println("Enter the state: ");
		String state = scan.next();
		
		System.out.println("Enter the email: ");
		String email = scan.next();
		
		System.out.println("Enter the zipcode: ");
		int zipcode = scan.nextInt();
		
		System.out.println("Enter the phone number: ");
		long phone = scan.nextLong();
		
		
		Contact contact = new Contact(firstName, lastName, address, city, state, email, zipcode, phone);
			
		return contact;
		}
		public void displayContact() {
		 
			for (Contact contact : addressBook)
		 		{
					System.out.println(contact);
		 		}
	    }
	 
	 	public void addContact() {
	 		
	 			addressBook.add(inputDetails());
     	}
     public int findContact(String firstName) {
    	 for (Contact contact : addressBook) {
    		 if(firstName.compareToIgnoreCase(contact.getFirstName())==0) {
    			 return addressBook.indexOf(contact);
    		 }
    	 }
     }
		public void editContact() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("enter the first name: ");
			String firstName = scan.next();
			
			int index = findContact(firstName);
			
			if(index == -1) {
				System.out.println(" null no contact");
				return;
			}
			addressBook.set(index,inputDetails());
		}
}