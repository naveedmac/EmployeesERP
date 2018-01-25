/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeserp;

import java.util.Scanner;

/**
 *
 * @author NaveedRaza
 */
public class EmployeesERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee EmployeeDB = new Employee();
        System.out.println("Welcome to Employees ERP ");
        System.out.println("Your Option are as follows");
        System.out.println("1. Input Employees");
        System.out.println("2. Display Employees");
        System.out.println("3. Search Employees");
        System.out.println("Press Any other key to exit.");
        Scanner input=new Scanner(System.in);
        System.out.print("Select Your Choice from Above ?");
        int i=input.nextInt();
        
        switch (i){
            case 1:
            EmployeeDB.MainSetEmployeesInDB();
            break;
            case 2:
        EmployeeDB.Display();
                break;
                case 3:
        System.out.print("This PArt is under development.");
                break;
                    default:
                        System.out.print("Thank YOu for using Employee ERP");
                    break;
                        
    }
        }
}
