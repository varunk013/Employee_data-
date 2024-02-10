import java.util.Scanner;

class Department_Det extends Emp_Details{
    public static void main(String[] args)
     {
        
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Date of Joining (DOJ): ");
            String doj = scanner.nextLine();

            System.out.print("Deptartment Name: ");
            String Deptname = scanner.nextLine();
            
            
            System.out.print("Department ID: ");
            String departmentId = scanner.nextLine();
            
            System.out.println("\nEmployee Details:");
            System.out.println("Name: " + name);
            System.out.println("Date of Joining (DOJ): " + doj);
            System.out.println("Name: " + Deptname);
            System.out.println("Department ID: " + departmentId);
            
            System.out.println("\nEmployee " + (i + 1) + " Department Details:");
            System.out.println("Department Name: " + Deptname);
            System.out.println("Department ID: " + departmentId);
            


        }
        
        scanner.close();
    }
}