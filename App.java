
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean isHotOutside = false;
		boolean isWeekday = false; 
		boolean hasMoneyInPocket = true; 
		
		double costOfMilk = 2.09;
		double moneyInWallet = 50;
		int thirstLevel = 3; 
		
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		
		
		System.out.println("Should I buy ice cream? " + shouldBuyIcecream);
		
		
	}

}
