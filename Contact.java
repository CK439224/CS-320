package cs320_module_3_contact;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String ContactID, String FirstName, String LastName, String PhoneNumber, String Address) {
		if(ContactID == null || ContactID.length() > 10) {
			throw new IllegalArgumentException("Invalid Contact ID: null or length > 10");
		}
		
		if(FirstName == null || FirstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name: null or length > 10");
		}
		
		if(LastName == null || LastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name: null or length > 10");
		}
		
		if(PhoneNumber == null || PhoneNumber.length() > 10 || PhoneNumber.length() < 10) {
			throw new IllegalArgumentException("Invalid Phone Number: null or length != 10");
		}
		
		if(Address == null || Address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address: null or length > 30");
		}
		
		this.contactID = ContactID;
		this.firstName = FirstName;
		this.lastName = LastName;
		this.phoneNumber = PhoneNumber;
		this.address = Address;
	}
	
	//Getters
	public String getContactID() {
		return this.contactID;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//Setters
	public void setContactID(String ContactID) {
		this.contactID = ContactID;
	}
	
	public void setFirstName(String FirstName) {
		this.firstName = FirstName;
	}
	
	public void setLastName(String LastName) {
		this.lastName = LastName;
	}
	
	public void setPhoneNumber(String PhoneNumber) {
		this.phoneNumber = PhoneNumber;
	}
	
	public void setAddress(String Address) {
		this.address = Address;
	}
	/*  Used to test my setters and getters with visual output
	public static void main(String args[]) {
		Contact c = new Contact("1234567899", "Billy", "Bob", "7245551144", "185 Nice Street Pittsburgh");
		System.out.println(c.getContactID());
		System.out.println(c.getFirstName());
		System.out.println(c.getLastName());
		System.out.println(c.getPhoneNumber());
		System.out.println(c.getAddress());
	}
	*/

}


