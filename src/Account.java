import java.util.ArrayList;
import java.util.List;
 

 abstract class Account {

  //THIS IS WRONG NEED TO SET USING A CONSTRUCTOR  public double balance = 0;  //made everything public because I feel like this isn't working 
    public double balance;
    public int number; 
    public float interest;  
    public Client owner; 

    // public Account(double balance){ //this caused an eror in subclasses put in notes dont entirely understand why...

    //   this.balance = 0;
    // }
 
    public void deposit(double depositAmount) {
 
      }

   // private void updateBalance(double depositAmount) { //Account.updateBalance --- FOR PRIVATE not objectName.updatebalance
        //this.balance += depositAmount;  //this is not mandatory?????
    //  } update balance and deposit are redundant...? 

    public void withdraw(double withdrawlAmount) {
          }

     public double getBalance() {
                return balance; 
          }
         
 }

 
 