import java.util.ArrayList;
import java.util.List;
 

 public class App {
     public static void main(String[] args) {

        //System.out.println("test");

        Employee testEmployee = new Employee(); //employee works but checking and account do not (account is abstract so.....)

        Checking testChecking = new Checking(); //changing the variable from private to public it fixed it

        testChecking.deposit(22.55);

        testChecking.deposit(50);

        testChecking.withdraw(11.22);

        System.out.println(testChecking.getBalance());




        
        
  }
 }


 