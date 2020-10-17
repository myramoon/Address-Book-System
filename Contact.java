/* Purpose: To add a contact in Address Book */

public class Contact {
	
	/*Variables*/
	String firstName;
	String lastName;
	String houseId;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String email;
	
	/* Parameterized constructor to initialize new contact*/
	Contact(String firstName,String lastName , String houseId, String city , String state,String zip, String phoneNumber,String email ){
		this.firstName = firstName;
		this.lastName = lastName;
		this.houseId = houseId;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public String toString() {
		return "First Name: " + this.firstName + " | Last Name: " + this.lastName + " | House Number : " + this.houseId + " | City: " + this.city + " | State: " + this.state + " | Zip: " + this.zip + " | Phone number: " + this.phoneNumber + " | Email:" + email;
	}
	
}
