public class SavingsAccountTest{

	public static void main(String[]args){
		SavingsAccount saver1 = new SavingsAccount(2000.00, 0.04);
		SavingsAccount saver2 = new SavingsAccount(3000.00, 0.04);

		System.out.printf("%nThe monthly interest for saver1 is: %.2f%n", saver1.calculateMonthlyInterest());
		System.out.printf("%nThe monthly interest for saver2 is: %.2f%n", saver2.calculateMonthlyInterest());

		System.out.printf("%nBalance for saver1 is: %.2f%n", saver1.balance());
		System.out.printf("%nBalance for saver2 is: %.2f%n", saver2.balance());


		saver1.modifyInterestRate(0.05);
			

		System.out.printf("%nThe new month interest for saver1 is: %.2f%n", saver1.calculateMonthlyInterest());
		System.out.printf("%nThe new month interest for saver2 is: %.2f%n", saver2.calculateMonthlyInterest());

		System.out.printf("%nNew balance for saver1 is: %.2f%n", saver1.balance());
		System.out.printf("%nNew balance for saver2 is: %.2f%n", saver2.balance());	
	}
}

