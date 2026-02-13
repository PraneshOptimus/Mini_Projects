import java.util.*;

public class Calculator {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean flag = true;

        while(flag){

            System.out.print("Enter the first number : ");
            double num1 = sc.nextDouble();

            System.out.print("\nEnter the second number : ");
            double num2 = sc.nextDouble();

            System.out.print("\nEnter the operator : +,-,*,/ : ");
            char st = sc.next().charAt(0);

            switch(st) {
                case '+' -> System.out.println("Addition of two numbers : "+(num1+num2));
                case '-' -> System.out.println("Subtraction of two numbers : "+(num1-num2));
                case '*' -> System.out.println("Multiplication of two numbers : "+(num1*num2));
                case '/' -> {
                    if (num2 ==0) {
                        System.out.println("Number can't be zero");
                    } else {
                        System.out.println("Division of two numbers : "+(num1/num2));
                    }
                }
                default -> System.out.println("Error");
            }
            System.out.print("\nWanna do again ? (Y/N) : ");
            char s = sc.next().toUpperCase().charAt(0);
            if(s=='Y'){
                flag = true;
            }
            else{
                flag = false;
            }

        }
        sc.close();
        System.out.println("Calculator closed Go to real world now !");
    }

}
