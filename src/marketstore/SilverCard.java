package marketstore;

/**
 * Silver card class
 */
public class SilverCard extends Card {

	/**
	 * SilverCard constructor
	 * @param cardowner The owner of the card
	 * @param turnover The turnover from the previous month
	 */
	public SilverCard(CardOwner cardowner, double turnover) {
		super(cardowner, turnover, 0.02);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculateDiscountRate() {
		if (this.getTurnover() > 300) {
			this.setDiscountRate(0.035);
			return this.getDiscountRate();
		} else {
			return this.getDiscountRate();
		}
	}

}
