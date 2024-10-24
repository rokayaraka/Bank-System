/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banksystem;


public class StockOrder {
    private double commission;
    StockOrder(double commission){
        this.commission=commission;
    }
    public double getcommission(){
        return commission;
    }
    
}
