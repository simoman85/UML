
package BankingSystem;
/**
 *
 * @author mk4022
 */
public class CheckProcessor {

   public void processCheck(BankAccount account, double amount) throws InsufficientFundsException {
       account.funds(amount);
       new Vendor().pay(amount);

   }
}
