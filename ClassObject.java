import java.util.Scanner;
public class ClassObject {
     String EmpName;
     float EmpSalary;

    void set(String n, float p){
        EmpName = n;
        EmpSalary = p;
    }
    void get(){
        System.out.println("Employee name: " + EmpName);
        System.out.println("Employee ID: " + EmpSalary);
    }
  public static void main( String[] args) {
    ClassObject emp = new ClassObject();
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter the name of the employee: ");
    String n = s1.nextLine();

    Scanner s2 = new Scanner(System.in);
    System.out.println("Enter the Salary of the employee: ");
    float p = s2.nextFloat();
    emp.set(n , p);
    emp.get();
  }
}
 
