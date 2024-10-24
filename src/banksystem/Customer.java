
package banksystem;
import java.util.*;


public class Customer {
    private String name;
    private String address;
    ArrayList<Account>accountList=new ArrayList<>();
    Customer(String name,String address){
        this.name=name;
        this.address=address;
    }
    
    void addAccount(Account account){
        accountList.add(account);
    }
        
    
}
