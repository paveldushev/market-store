package marketstore;

/**
 *Gold card class
 */
public class GoldCard extends Card {

	/**
	 * GoldCard constructor
	 * @param cardowner The owner of the card
	 * @param turnover The turnover form the previous month
	 */
	public GoldCard(CardOwner cardowner, double turnover) {
		super(cardowner, turnover, 0.02);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public double calculateDiscountRate() {
		if (this.getTurnover() < 100) {
			return this.getDiscountRate();
		} else {
			int factor = (int) (this.getTurnover() / 100);
			
			if (factor >= 8) {
				this.setDiscountRate(0.1);
			} else {
				this.setDiscountRate(0.02 + ((double) factor) / 100);
			}

			return this.getDiscountRate();
		}
	}

}
