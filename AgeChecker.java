import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class AgeChecker {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        System.out.print("\nEnter your Date Of Birth (DD-MM-YYYY) : ");
        String dob = sc.nextLine();

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dob, dt);
        LocalDate today = LocalDate.now();

        Period age = Period.between(date, today);

        System.out.println("\n"+
            name+" your current age is "+
            age.getYears()+" years "+
            age.getMonths()+" Months "+
            age.getDays()+" Days "
        );

    }

}
