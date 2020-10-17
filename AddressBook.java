/* Purpose: To create a contact in Address Book */
import java.util.Scanner;

public class AddressBook {

	public static void main (String[] args) {
		
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
		
		//Create a contact 
		Contact contact1 = new Contact(firstName,lastName,houseId,city,state,zip,phoneNumber,email);
		contact1.displayContact(contact1);

	}
}

