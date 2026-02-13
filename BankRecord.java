import java.util.*;

public class BankRecord {
    
    public static void main(String[] args){
        
        Bank b1 = new Bank();
        b1.setBalance(1000);
        b1.display();
        b1.withdraw(10001);
        b1.display();
        b1.withdraw(100);
        b1.display();


    }

}

class Bank{

    private double balance;

    public Bank(){

    }

    public Bank(double balance){
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(Double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Added Successfull !");
        }
        else if(amount < 0){
            System.out.println("Enter valid amount !");
        }
        else if(amount == 0){
            System.out.println("Amount should be greater than zero !");
        }
        else{
            System.out.println("Enter valid amount !");
        }
    }

    public void withdraw(double amount){

        if(balance < amount ) System.out.println("Insufficient Balance");
        else if(amount < 0 ) System.out.println("The Amount Should Be Greater than zero");
        else{
            balance -= amount;
            System.out.println("Withdraw Successful !");
            System.out.println("Your updated Balance : "+balance);
        }
    }

    public void display(){
        System.out.println("The Balance is : "+balance);
    }
}