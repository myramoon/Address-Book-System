/* Purpose: To add a contact in Address Book */
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<Contact> contacts = new ArrayList<>();

	public void addContact() {
		
		//Take contact details from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = scan.nextLine();
		System.out.println("Enter last name: ");
		String lastName = scan.next();
		System.out.println("Enter house id: ");
		String houseId = scan.next();
		System.out.println("Enter city : ");
		String city = scan.next();
		System.out.println("Enter state: ");
		String state = scan.next();
		System.out.println("Enter zip: ");
		String zip = scan.next();
		System.out.println("Enter phone number: ");
		String phoneNumber = scan.next();
		System.out.println("Enter email: ");
		String email = scan.next();
		scan.close();
		Contact contact1 = new Contact(firstName,lastName,houseId,city,state,zip,phoneNumber,email);
		contacts.add(contact1);
				
	}
	
	public void displayBook(AddressBook book) { //show added contact
		
		System.out.println(book.contacts);
		 
	}

	public static void main (String[] args) {
				
		AddressBook book = new AddressBook(); //Create an Address book 
		book.addContact();  	   	     //Add a contact to the address book
		book.displayBook(book);    	     //Display the contact
		
	}
}


