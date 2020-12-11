public class SavingsAccount extends Account {



    //Uncomment the getters and setters after writing the attributes
    private double minimumBalance;
    
    public SavingsAccount(int accountNumber,Customer customerObj,double balance,double minimumBalance){
        super(accountNumber,customerObj,balance);
        this.minimumBalance=minimumBalance;
    }
    public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
    
    public boolean withdraw(double amount){
        if(balance>amount){
            double a = balance - amount;
            if(a>minimumBalance){
                super.setBalance(balance-amount);
            return true;    
            }
            else{
                return false;
            }
            
        }
        else{
            return false;
        }
    }
    
}

    