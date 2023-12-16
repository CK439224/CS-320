package cs320_module_3_contact_test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import cs320_module_3_contact.Contact;
import cs320_module_3_contact.ContactService;

import org.junit.jupiter.api.Order;

@TestMethodOrder(OrderAnnotation.class)
public class ContactServiceTest {

	/*
	 * The following tests are to ensure that the ContactService class is working properly. In each test, a new
	 * In each test, a new service is created with default values for each field. Then the service is
	 * requested to make some change to the list of contacts and the result is
	 * tested to ensure the actual field matches what is expected.
	 *
	 */
	@Test
	@DisplayName("Test to Update First Name.")
	@Order(1)
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		service.updateFirstName("Bobby", "123456789");
		//service.displayContactList();
		assertEquals("Bobby", service.getContact("123456789").getFirstName(), "First name was not updated.");
	}

	@Test
	@DisplayName("Test to Update Last Name.")
	@Order(2)
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		service.updateLastName("Johnson", "123456789");
		//service.displayContactList();
		assertEquals("Johnson", service.getContact("123456789").getLastName(), "Last name was not updated.");
	}

	@Test
	@DisplayName("Test to update phone number.")
	@Order(3)
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		service.updateNumber("0987654321", "123456789");
		//service.displayContactList();
		assertEquals("0987654321", service.getContact("123456789").getPhoneNumber(), "Phone number was not updated.");
	}

	@Test
	@DisplayName("Test to update address.")
	@Order(4)
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		service.updateAddress("321 OverHere Ave", "123456789");
		//service.displayContactList();
		assertEquals("321 OverHere Ave", service.getContact("123456789").getAddress(), "Address was not updated.");
	}

	@Test
	@DisplayName("Test to ensure that service correctly deletes contacts.")
	@Order(5)
	void testDeleteContact() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		service.deleteContact("123456789");
		// Ensure that the contactList is now empty by creating a new empty contactList to compare it with
		ArrayList<Contact> contactListEmpty = new ArrayList<Contact>();
		//service.displayContactList();
		assertEquals(service.contactList, contactListEmpty, "The contact was not deleted.");
	}

	@Test
	@DisplayName("Test to ensure that service can add a contact.")
	@Order(6)
	void testAddContact() {
		ContactService service = new ContactService();
		service.addContact("123456789", "Mr.", "Cam", "1234567890", "123 Fake Name Lane");
		//service.displayContactList();
		assertNotNull(service.getContact("123456789"), "Contact was not added correctly.");
	}

}





