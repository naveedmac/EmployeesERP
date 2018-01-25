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
public class Employee {
    int NumberOfEmployees;
    String[][] DBOfEmployee;
    
    String NameOfEmployee[]= new String[10]; 
    String FatherNameOfEmployee[]= new String[10]; 
    int Age[]=new int[10];
    int Salary[]=new int[10];
    public String getEmplyeeName (String lblTitle)
    {
    Scanner input=new Scanner(System.in);
        System.out.print("Please Input "+ lblTitle +" :");return(input.next());
    }
    public int getEmplyeeAge (String lblTitle)
    {
    Scanner input=new Scanner(System.in);
        System.out.print("Please Input "+ lblTitle +" :");return(input.nextInt());
    }
 public void SetEmployeesInDB (int EmpID)
    {
    
    DBOfEmployee[EmpID][0]=getEmplyeeName ("Name of Employee " + (EmpID+1) + " :");
    DBOfEmployee[EmpID][1]=getEmplyeeName ("Father Name of Employee " + (EmpID+1) + " :");
    DBOfEmployee[EmpID][2]= Integer.toString(getEmplyeeAge ("Age of Employee " + (EmpID+1) + " :"));
    DBOfEmployee[EmpID][3]= Integer.toString( getEmplyeeAge ("Salary of Employee " + (EmpID+1) + " :"));
    
    }
 public int getNoOfEmplyees ()
    {
    Scanner input=new Scanner(System.in);
        System.out.print("How many employees do you have ?");return(input.nextInt());
    }
 public void MainSetEmployeesInDB ()
    {
        NumberOfEmployees=getNoOfEmplyees ();
        DBOfEmployee = new String[NumberOfEmployees][4];
    if (NumberOfEmployees==0) {
        System.out.println("Be careful next time ");
        NumberOfEmployees=getNoOfEmplyees ();
         }
    else{
        
        if (NumberOfEmployees>10) {
        System.out.println("Dont be Naughty");
        NumberOfEmployees=getNoOfEmplyees ();
         }else 
        {
        
        for (int j=0; j<NumberOfEmployees; j++)
        {
            SetEmployeesInDB (j);
        System.out.println("Employee Succesfull Saved in DB");
        
        }
        }
        
    }
    }
 public void Display()
    {
        System.out.println("Following Employees are Enroll in Your Company:");
        System.out.println("***************************************************");
        System.out.println("*  NAME   ** FATHER NAME **   SALARY   **   AGE   *");
        System.out.println("***************************************************");
         for (int j=0; j<NumberOfEmployees; j++)
        {
        System.out.println("*" + DBOfEmployee[j][0] + "** " + DBOfEmployee[j][1] +" **"+DBOfEmployee[j][2]+"**"+DBOfEmployee[j][3]+"*");
        }
         System.out.println("***************************************************");
    }
 
}
