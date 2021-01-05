
/**
 * @author Sandeep_Singh
 * functionality Add new Contact Address
 *
 */
import java.util.Scanner;

class Address {
	private String city;
	private String state;
	private String zipcode;
	private String email;

	public static void main(String[] args) {
		System.out.println("Welcome To Address Book Program");

	}

	public Address(String city, String state, String zipcode, String email) {
		this.city = city;
		this.state = state;
		this.email = email;
		this.zipcode = zipcode;

	}

	public String toString() {
		return " [city=" + city + ", state=" + state + ", zipcode=" + zipcode + ", email=" + email;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getemail() {
		return email;
	}

}

public class AddressBook {
	private static void addContact() {
		Scanner inp = new Scanner(System.in);
		System.out.println("\nAddress:");
		System.out.println("Enter the city:");
		String city = inp.nextLine();
		System.out.println("Enter the state:");
		String state = inp.nextLine();
		System.out.println("Enter the zipcode:");
		String zipCode = inp.nextLine();
		System.out.println("Enter the email-id:");
		String email = inp.nextLine();
		Address personAddress = new Address(city, state, zipCode, email);
		System.out.println(personAddress);
		inp.close();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		addContact();
	}
}

