import java.util.Scanner;

public class Emp_Details  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter employee details:");
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Date of Joining (DOJ): ");
        String doj = scanner.nextLine();
        
        System.out.print("Department ID: ");
        String departmentId = scanner.nextLine();
        
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Date of Joining (DOJ): " + doj);
        System.out.println("Department ID: " + departmentId);     

        
        
        scanner.close();
    }
}
