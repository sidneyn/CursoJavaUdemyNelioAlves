package entities;

public class Account {

		private int number;
		private String holder;
		private double balance;
		
		public Account (int number, String holder) {
			this.number = number; 
			this.holder = holder;
						
		}	

		public Account (int number, String holder, double initialDeposit) {
			this.number = number; 
			this.holder = holder;
			deposit (initialDeposit);						
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public int getNumber() {
			return number;
		}

		public String getholder() {
			return holder;
		}
		
		public void deposit (double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) {
			balance -= amount + 5.0;
		}
		
		
}
