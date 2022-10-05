
package BankingSystem;
/**
 *
 * @author mk4022
 */
    abstract class   Account {
    protected double total;
    protected Account nextAvailableAccount;
    protected double toWithdrawn;
            

    public Account(double balance){
        this.total=balance;
     
       

}
    public abstract void deduct(double amount);
    
    
    public void funds(double remainder) {
    double fund =this.total-remainder;
    if (fund>=0.0){
            deduct(remainder);
    }
            else
                  if(fund<0.0  && this.nextAvailableAccount!=null)  {
                      this.deduct(toWithdrawn);
                  }
                          else
                  {
                    deduct(total);



            }
    }
    public void nextChain(Account account)  {
        this.nextAvailableAccount=account;

    }
    public Account getNext(){
                     return this.nextAvailableAccount;
                 }

    void setNextChain(Account account) {

    }
  }

  
 class  BankAccount extends Account { 
    
    public BankAccount(double total)throws InsufficientFundsException {
        super(total );
        
    }

   
   
     
     void  makeDeposit( double Amount){
         super.total=total+Amount;
         
     } 
 
    @Override
        public void deduct (double Amount){
            super.total =total-Amount;
                  }

    void setNextAccount(Account account) {

    }
              }

 class CreditAccount extends Account{
    public CreditAccount(double total) throws InsufficientFundsException{
        super( total);
    }

    public void deduct(double amount){
        super.total =total- amount;
    }
}

