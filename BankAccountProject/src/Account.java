

 abstract class Account {

     private double balance = 0; 
     private int number; 
     private float interest;  
    private Client owner; 
 
    public void deposit(double depositAmount) {
 
      }

    private void updateBalance(double depositAmount) { //Account.updateBalance --- FOR PRIVATE not objectName.updatebalance
        this.balance += depositAmount;  //this is not mandatory?????
      }

    public void withdraw(double withdrawlAmount) {
          }

     public double getBalance() {
                return balance; 
          }
         
 }

 
 