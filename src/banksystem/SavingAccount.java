/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;


public class SavingAccount extends Account{
    private double interestRate;
    SavingAccount(double cashBalance, double interestRate){
        super(cashBalance);
        this.interestRate=interestRate;
        
    }
    public double getinterstRate(){
        return interestRate;
    }
    
}
