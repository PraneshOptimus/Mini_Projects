import java.util.*;

public class StudentRecord {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        Map<String, ArrayList<Student>> deptWise = new HashMap<>();

        String name="";
        int age=0;
        String dpt="";

        for(int i=0;i<n;i++){
            try{
                System.out.print("Enter student name :");
                name = sc.nextLine();

                System.out.print("\nEnter student age : ");
                age = sc.nextInt();
                sc.nextLine();
                

                System.out.print("\nEnter student dpt : ");
                dpt = sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println("Enter Valid Details");

            }

            Student s = new Student(name, age, dpt);

            students.add(s);

            deptWise.computeIfAbsent(dpt,k ->  new ArrayList<>()).add(s);
    
        }

        for(String dept : deptWise.keySet()){
            System.out.println("\n == "+dept+" == ");
            for(Student st : deptWise.get(dept)){
                System.out.println(
                    "Name : "+st.getName()
                );
            }
        }

        for(int i=0;i<n;i++){
            students.get(i).display();
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
