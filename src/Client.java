import java.util.ArrayList;
import java.util.List;
 

 class Client extends User  {

    public Account account; //Questions about this, instantiate user and account //made publica again missing somethingwith private---MISSING GETTER AND SETTER??

    public void transfer(double transferamount, int targetAccount){
    }

    public void userNameSet(String userName){

      this.userName = userName;

    }

    public void PasswordSet(String password){

      this.password = password;
    }

    public String userNameGet(){ //no parameters here must have a method type 

        return userName;
    }

    public String PasswordGet(){

        return password;
    }

    public void userNameLogIn(String userName){

      //if(userName.equals(object.username)) ????????
    }

    public void PasswordLogIn(String password){
    }


 } 

 