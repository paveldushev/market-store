package marketstore;

/**
 * Abstract class Card 
 */
public abstract class Card {

	/**
	 * Every card belongs to a corresponding card owner
	 */
	private CardOwner cardowner;
	
	/**
	 *Turnover for the previous month 
	 */
	private double turnover;
	
	/**
	 * Initial discount rate, which the card provides
	 */
	private double discountRate;

	/**
	 * Card constructor
	 * @param cardowner The owner of the card
	 * @param turnover The turnover for the previous month
	 * @param discountRate The inital discount rate
	 */
	public Card(CardOwner cardowner, double turnover, double discountRate) {
		if (cardowner == null) {
			throw new IllegalArgumentException("Card owner is not specified");
		}
		this.cardowner = cardowner;
		if (turnover < 0) {
			throw new IllegalArgumentException("Turnover can not be less than 0");
		}
		this.turnover = turnover;

		if (discountRate < 0) {
			throw new IllegalArgumentException("Discount rate can not be less than 0");
		}
		this.discountRate = discountRate;
	}
	
	/**
	 * An abstract method for calculating the current discount rate with regards to the turnover for the corresponding type of card
	 * @return current discount rate
	 */
	public abstract double calculateDiscountRate();
	
	/**
	 * Gets the card owner
	 * @return card owner
	 */
	public CardOwner getCardowner() {
		return cardowner;
	}

	/**
	 * Sets the card owner of the card to the given one
	 * @param cardowner New card owner
	 */
	public void setCardowner(CardOwner cardowner) {
		this.cardowner = cardowner;
	}

	/**
	 * Gets the turnover
	 * @return the turnover
	 */
	public double getTurnover() {
		return turnover;
	}

	/**
	 * Sets the turnover to given value
	 * @param turnover New turnover value
	 */
	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	/**
	 * Gets the discount rate of the card
	 * @return discount rate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * Sets the discount rate to the given value
	 * @param discountRate New discount rate value
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
