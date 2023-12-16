package cs320_module_3_contact_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import cs320_module_3_contact.Contact;

class ContactTest {

	@Test
	void testValidContactCreation() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
	    assertEquals("1234567890", contact.getContactID());
	    assertEquals("John", contact.getFirstName());
	    assertEquals("Doe", contact.getLastName());
	    assertEquals("1234567890", contact.getPhoneNumber());
	    assertEquals("123 Main St", contact.getAddress());
	}
	
	@Test
	void testValidValuesConstructor() {
	    Assertions.assertDoesNotThrow(() -> {
	        new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
	    });
	}
	
	@Test
	void testSetAddressValid() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

	    contact.setAddress("456 Oak Ave");
	    assertEquals("456 Oak Ave", contact.getAddress());
	}
	

	@Test
	void testPhoneNumberFormat() {
	    Assertions.assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("1234567890", "John", "Doe", "invalid", "123 Main St");
	    });
	}
	
//Test Contact ID
	
	@Test
	void testSetContactIDValid() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

	    contact.setContactID("0987654321");
	    assertEquals("0987654321", contact.getContactID());
	}
	

	@Test
    void testContactIDMaxLength() {
        Assertions.assertDoesNotThrow(() -> {
            new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        });
    }
	
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789012", "Billy", "Barns", "4123335464", "122 Fair Ave Pittsburgh");
			});
	}
	
	@Test
	void testContactIDNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null , "Billy", "Barns", "4123335464", "122 Fair Ave Pittsburgh");
			});
	}
	
//Test First Name
	
	@Test
	void testSetFirstNameValid() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

	    contact.setFirstName("Jane");
	    assertEquals("Jane", contact.getFirstName());
	}


	@Test
    void testFirstNameMinLength() {
        Assertions.assertDoesNotThrow(() -> {
            new Contact("1234567890", "J", "Doe", "1234567890", "123 Main St");
        });
    }
	

	@Test
	void testSetLastNameValid() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

	    contact.setLastName("Smith");
	    assertEquals("Smith", contact.getLastName());
	}

	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy012345", "Barns", "4123335464", "122 Fair Ave Pittsburgh");
			});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , null , "Barns", "4123335464", "122 Fair Ave Pittsburgh");
			});
	}
	
//Test Last Name
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy", "Barns012345", "4123335464", "122 Fair Ave Pittsburgh");
		});
	}

	@Test
	void testLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy" , null , "4123335464", "122 Fair Ave Pittsburgh");
		});
	}
	
//Test Phone Number
	
	@Test
	void testSetPhoneNumberValid() {
	    Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

	    contact.setPhoneNumber("9876543210");
	    assertEquals("9876543210", contact.getPhoneNumber());
	}


	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy", "Barns012345", "412333546412", "122 Fair Ave Pittsburgh");
		});
	}
	
	@Test
	void testPhoneNumberTooShort() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy", "Barns012345", "41233354", "122 Fair Ave Pittsburgh");
		});
	}

	@Test
	void testPhoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy" , "Barns" , null , "122 Fair Ave Pittsburgh");
		});
	}
	
//Test Address
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy", "Barns", "4123335464", "122 Fair Ave Pittsburgh02846589");
		});
	}

	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("123456789" , "Billy" , "Barns" , "4123335464", null);
		});
	}
	
	

}


