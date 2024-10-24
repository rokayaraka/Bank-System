
package banksystem;


public class Stock {
    private String ticker;
    private int quantity;
    private StockOrder
    Stock(String ticker, int quantity){
        this.ticker=ticker;
        this.quantity=quantity;
        
    }
    public  String getticker(){
        return ticker;
    }
    public int getquantity(){
        return quantity;
    }
}
