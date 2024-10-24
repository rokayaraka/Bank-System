
package banksystem;

import java.util.*;

public class investmentAccount extends Account {
    private ArrayList<Stock>stockList=new ArrayList<>();
    private  StockOrder stockorder;
    investmentAccount(double cashBalance,double commision){
    super(cashBalance);
    stockorder=new StockOrder(commision);
    
    }
    void addStock(Stock stock){
        stockList.add(stock);
    }
    
    
}
