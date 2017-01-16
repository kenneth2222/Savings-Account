public class SavingsAccount{

	static double annualInterest;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance, double annualInterest){
		this.savingsBalance = savingsBalance;
		this.annualInterest = annualInterest;
	}

	public void setSavingsBalance(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public double getSavingsBalance(){
		return savingsBalance;
	}

	public void setAnnualInterest(double annualInterest){
		this.annualInterest = annualInterest;
	}

	public double getAnnualInterest(){
		return annualInterest;
	}

	public double calculateMonthlyInterest(){
		double interest = (getSavingsBalance() * getAnnualInterest()) / 12;

		return interest;
	}

	public static double modifyInterestRate(double newRate){
		annualInterest = newRate;

		return annualInterest;
	}

	public double balance(){
		double newBalance = getSavingsBalance() + calculateMonthlyInterest();

		return newBalance;
	}
}


