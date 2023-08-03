import java.util.ArrayList;
import java.util.List;
 

  class Checking extends Account {


    public Checking() {
      //CONSTRUCTOR  Default values for instance variables
      this.interest = 0.06f;;
      this.balance = 0;
  }


    public void deposit(double depositAmount) {

      this.balance += depositAmount;
 
    }

    public void withdraw(double withdrawlAmount) {

      this.balance -= withdrawlAmount;

    }

 }


