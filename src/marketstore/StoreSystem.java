package marketstore;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * The StoreSystem class provides the functionality to operate orders with customers' cards.
 */
public class StoreSystem {
	
	/**
	 * List of all valid cards, which are linked to the customers, who can benefit from discounts
	 */
	private List<Card> cards;
	
	/**
	 * Class constructor
	 */
	public StoreSystem() {
		this.cards = new ArrayList<Card>();
	}

	
	/**
	 * Calculates the total discount that could be applied with the corresponding card
	 * @param card the card itself
	 * @param purchaseValue The value of the current purchase
	 * @return discount
	 */
	public double calculateDiscount(Card card, double purchaseValue) {
		return purchaseValue * card.calculateDiscountRate();
	}
	

	/**
	 * Calculates the total cost of the purchase after the discount
	 * @param card the card itself
	 * @param purchaseValue The value of the current purchase
	 * @return total cost of purchase after the discount
	 */
	public double calculateTotalCost(Card card, double purchaseValue) {
		double discount = calculateDiscount(card, purchaseValue);
		return (purchaseValue - discount);
	}
	
	/**
	 * Prints all relevant details of a purchase, such as purchase value, discount rate, total discount and total cost of the purchase
	 * @param card the card itself
	 * @param purchaseValue The value of the current purchase
	 */
	public void printOrder(Card card, double purchaseValue) {
		DecimalFormat df = new DecimalFormat("####0.00");
		System.out.println("Purchase value: $" + df.format(purchaseValue) + "\n" + 
						   "Discount rate: " + df.format((card.calculateDiscountRate())*100) + "%" + "\n" +
						   "Discount: $" + df.format(calculateDiscount(card, purchaseValue)) + "\n" +
						   "Total: $" + df.format(calculateTotalCost(card, purchaseValue)) + "\n");
	}
	
	/**
	 * Gets all valid registered cards for discount
	 * @return a list of all cards
	 */
	public List<Card> getCards() {
		return cards;
	}
	
	/**
	 * Adds a card to the list
	 * @param card the card itself
	 */
	public void addCard(Card card) {
		cards.add(card);
	}
	
	/**
	 * Removes the card from the list, which makes it no longer a valid one.
	 * @param card the card itself
	 */
	public void removeCard(Card card) {
		cards.remove(card);
	}
	
	/**
	 * Finds a card from the list, given only its owner's name
	 * @param firstName The first name of the card owner
	 * @param lastName The last name of the card owner
	 * @return the card itself, if such is found
	 */
	public Card findCardByOwnerName(String firstName, String lastName) {
		for (Card c: cards) {
			if (c.getCardowner().getFirstName().equals(firstName) && c.getCardowner().getLastName().equals(firstName)) {
				return c;
			}
		}
		
		System.out.println("No card found!");
		return null;
	}

}
