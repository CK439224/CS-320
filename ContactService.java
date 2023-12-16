package cs320_module_3_contact;

import java.util.ArrayList;

import cs320_module_3_contact.Contact;
import cs320_module_3_contact.ContactService;

public class ContactService {
	// Start with an ArrayList
	public ArrayList<Contact> contactList = new ArrayList<Contact>();

	// Display the full list of contacts to the console for error checking.
//	public void displayContactList() {
//		for (int counter = 0; counter < contactList.size(); counter++) {
//			System.out.println("\t Contact ID: " + contactList.get(counter).getContactID());
//			System.out.println("\t First Name: " + contactList.get(counter).getFirstName());
//			System.out.println("\t Last Name: " + contactList.get(counter).getLastName());
//			System.out.println("\t Phone Number: " + contactList.get(counter).getPhoneNumber());
//			System.out.println("\t Address: " + contactList.get(counter).getAddress() + "\n");
//		}
//	}

	// Adds a new contact
	public void addContact(String ContactID, String FirstName, String LastName, String PhoneNumber, String Address) {
		// Create the new contact
		Contact contact = new Contact(ContactID, FirstName, LastName, PhoneNumber, Address);
		contactList.add(contact);

	}

	// Using Contact ID, return a contact object
	public Contact getContact(String contactID) {
		Contact contact = new Contact("*", "*", "*", "**********", "*");
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().contentEquals(contactID)) {
				contact = contactList.get(counter);
			}
		}
		return contact;
	}

	// Delete contact.
	public void deleteContact(String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.remove(counter);
				break;
			}

		}
	}

	// Update the first name.
	public void updateFirstName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setFirstName(updatedString);
				break;
			}

		}
	}

	// Update the last name.
	public void updateLastName(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setLastName(updatedString);
				break;
			}

		}
	}

	// Update the phone number.
	public void updateNumber(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setPhoneNumber(updatedString);
				break;
			}

		}
	}

	// Update the address.
	public void updateAddress(String updatedString, String contactID) {
		for (int counter = 0; counter < contactList.size(); counter++) {
			if (contactList.get(counter).getContactID().equals(contactID)) {
				contactList.get(counter).setAddress(updatedString);
				break;
			}

		}
	}
}


