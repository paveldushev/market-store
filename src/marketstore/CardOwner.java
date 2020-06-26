package marketstore;


import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class CardOwner {

	/**
	 * A counter for automatic increment, which guarantees the uniqueness of the ID
	 */
	private static final AtomicInteger count = new AtomicInteger(0);
	
	/**
	 * A personal card owner's ID for the system
	 */
	private final int ownerID;
	
	/**
	 * The first name of the card owner
	 */
	private String firstName;
	
	/**
	 * The last name, also family name, of the card owner
	 */
	private String lastName;
	
	/**
	 * Issue Date of the owner, when his data was added in the system
	 */
	private final Date issueDate;
	
	
	/**
	 * CardOwner constructor
	 * @param firstName The first name of the card owner
	 * @param lastName The last name of the card owner
	 * @throws IllegalArgumentException
	 */
	public CardOwner(String firstName, String lastName) {
		//generates the new unique ID for the customer
		this.ownerID = count.incrementAndGet();
		
		if (firstName == null) {
			throw new IllegalArgumentException("Card owner is not specified");
		}
		this.firstName = firstName;
		
		if (lastName == null) {
			throw new IllegalArgumentException("Card owner is not specified");
		}
		this.lastName = lastName;
		
		this.issueDate = new Date();
	}
	
	/**
	 * Gets the first name of the card owner
	 * @return First name of the card owner
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the card owner
	 * @param firstName New value for the first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name of the card owner
	 * @return The last name of the card owner
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the last name of the card owner	
	 * @param lastName The new value for the last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the card owner's ID
	 * @return the card owner's ID
	 */
	public int getOwnerID() {
		return ownerID;
	}

	/**
	 * Gets the issue date of the card owner, when he was initially registered in the system
	 * @return the issue date of the card owner
	 */
	public Date getIssueDate() {
		return issueDate;
	}

}
