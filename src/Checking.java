// import java.util.ArrayList;
// import java.util.List;
// these aren't used yet so I commented them
 

class Checking implements Account {

  private int accountNumber; 
  private Client owner;
  private double balance;
  private float interest;

  // moving declarations of balance and interest to the individual account
  // ended up moving owner and accountNumber here as well because we can't set them on declaration of the class if they're declared in the interface

  public Checking(int number, Client owner) {
    //CONSTRUCTOR
    accountNumber = number;
    this.owner = owner;
  }


  public void deposit(double depositAmount) {

  this.balance += depositAmount;  

  }

  public void withdraw(double withdrawlAmount) {

  this.balance -= withdrawlAmount;  

  }

  public double getBalance(){
    return balance;
  }

  public void setInterest(float interest){
    this.interest = interest;
  }

  public float getInterest(){
    return interest;
  }

  public Client getOwner(){
    return owner;
  }

  public int getAccountNumber(){
    return accountNumber;
  }

}


