package com.bridgelabz;
import java.util.Scanner;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("entering to the address book: ");
		
		Scanner scan = new Scanner(System.in);
		
		AddressBook adBook = new AddressBook();
		
		
	}


	String ch;
    while (true) {
    	 System.out.println("*********Menu*************");
    	 System.out.println("1. display contact\n 2. add contact\n 3. edit contact\n 4. delete contact\n 5. exit");
        System.out.println("Enter your choice:");
        
        
        ch = scan.nextLine();
        
        switch (ch) {
        	case 1:
        		adBook.displayContact();
        		System.out.println("display contact");
        		break;
            case 2:
            	adBook.addContact();
            	System.out.println("add contact");
                break;
            case 3:
            	adBook.editContact();
            	System.out.println("edit contact");
                break;
            case 4:
                adBook.deleteContact();
            	System.out.println("delete contact");
                break;
            case 5:
            	adBook.exit();
            	System.out.println("exit contact");
            	break;
			default:
				System.out.println("entered invalid choice ");
				break;
			}
}
}
}
