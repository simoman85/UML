
package BankingSystem;

/**
 *
 * @author mk4022
 */

    public class Vendor implements PayingParty {
  double amount;

public void pay(double amount){
this.amount = amount;
System.out.println("Payment made in the amount of $" + amount);
}

}
