import java.util.*;

public class StudentRecord {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] sts = new Student[n];


        for(int i=0;i<n;i++){
            System.out.print("Enter student name :");
            String name = sc.nextLine();

            System.out.print("\nEnter student age : ");
            int age = sc.nextInt();
            sc.nextLine();
            

            System.out.print("\nEnter student dpt : ");
            String dpt = sc.nextLine();

            sts[i] = new Student(name, age, dpt );

        }

        for(int i=0;i<n;i++){
            sts[i].display();
        }
    }

}
class Student{

    private String name;
    private int age;
    private String dpt;

    public Student(){

    }

    public Student(String name, int age, String dpt){
        this.name=name;
        this.age=age;
        this.dpt=dpt;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDpt(String dpt){
        this.dpt=dpt;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getDpt(){
        return dpt;
    }

    public void display(){
        System.out.printf("%-15s | %-4d | %-10s%n", name, age, dpt);
    }

}
