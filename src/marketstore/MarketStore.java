package marketstore;


public class MarketStore {
	private static StoreSystem storeSystem = new StoreSystem();
	
	public static void main(String[] args) {
		
		CardOwner cardOwnerB = new CardOwner("Boris", "Johnson");
		CardOwner cardOwnerS = new CardOwner("Silvio", "Luther");
		CardOwner cardOwnerG = new CardOwner("George", "Washington");
		
		BronzeCard bronzeCard = new BronzeCard(cardOwnerB, 0);
		storeSystem.addCard(bronzeCard);
		storeSystem.printOrder(bronzeCard, 150);
		
		SilverCard silverCard = new SilverCard(cardOwnerS, 600);
		storeSystem.addCard(silverCard);
		storeSystem.printOrder(silverCard, 850);
		
		GoldCard goldCard = new GoldCard(cardOwnerG, 1500);
		storeSystem.addCard(goldCard);
		storeSystem.printOrder(goldCard, 1300);

	}

}
