
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isHotOutside = false;
		boolean isWeekDay = false; 
		boolean hasMoneyInPocket = true; 
		
		double costOfMilk = 2.09;
		double moneyInWallet = 50;
		int thirstLevel = 3; 
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && isWeekDay;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekDay;
		boolean willBuyMilk = isHotOutside && (thirstLevel >= 3) && (moneyInWallet >= costOfMilk*2);

		
		System.out.println("Should I buy ice cream? " + shouldBuyIcecream);
		System.out.println("Should I go swimming? " + willGoSwimming);
		System.out.println("Is it a good day? " + isAGoodDay);
		System.out.println("Should I buy milk? " + willBuyMilk);

		
		
	}

}
