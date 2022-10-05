
package BankingSystem;

/**
 *
 * @author mk4022
 */

    public class Customer implements PayingParty{
    
  public  BankAccount checking;
    public CheckProcessor checkProcessor= new CheckProcessor();



   public Customer(BankAccount checking){
        this.checking = checking;
}

    
    
  public void addAccount(Account acc){

    if (checking.getNext() == null){
    this.checking.setNextAccount(acc);
    return;
}
Account current = checking;
while (current.getNext() != null){
current = current.getNext();
}
current.setNextChain(acc);
}

public double pay(double amount) throws InsufficientFundsException {
this.checkProcessor.processCheck(checking, amount);
return amount;
    }
    }


