package marketstore;

/**
 * Bronze card class
 */
public class BronzeCard extends Card {

	/**
	 * BronzeCard constructor
	 * @param cardowner The owner of the card
	 * @param turnover The turnover from the previous month
	 */
	public BronzeCard(CardOwner cardowner, double turnover) {
		super(cardowner, turnover, 0.0);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculateDiscountRate() {
		if (this.getTurnover() >= 100 && this.getTurnover() <= 300) {
			this.setDiscountRate(0.01);
			return this.getDiscountRate();
		} else if (this.getTurnover() > 300) {
			this.setDiscountRate(0.025);
			return this.getDiscountRate();
		}
		
		return this.getDiscountRate();
	}
	
	

}
