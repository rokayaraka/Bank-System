
package banksystem;


public class Account {
    private double cashBalance;
    Account(double cashBalance)
    {
        this.cashBalance=cashBalance;
        
    }
    public double getcashBalance(){
        return cashBalance;
    }
    public void setcashbalance(double cashBalance){
        this.cashBalance=cashBalance;
    }
}
