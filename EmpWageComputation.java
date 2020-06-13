import java.util.Random;
public class EmpWageComputation{

   public static final int IS_EMP_FULL_TIME = 1;
   public static final int IS_EMP_PART_TIME = 2;
   // public static final int EMP_RATE_PER_HOUR = 10;
   // public static final int WORKING_DAYS_IN_MONTH = 20;
   // public static final int MAXIMUM_WORK_HOURS = 100;
   
   // public static int totalEmpHours = 0;
   // public static int totalSalary = 0;
   // public static int totalWorkingDays = 0;
   // public static int empHours = 0;
   // public static int dailyWage = 0;

   
   public static int computeEmpWage(String company ,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
     
    int empHrs = 0 , totalEmpHrs = 0 , totalWorkingDays = 0 ;



      while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays){
        totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random()* 10 ) % 3;

        switch (empCheck){
          case IS_EMP_PART_TIME:
          empHrs=4;
          break;
          case IS_EMP_FULL_TIME:
          empHrs=8;
          break;

          default:
          empHrs=0;

        }

        totalEmpHrs +=empHrs;  
       System.out.println("Day# : " + totalWorkingDays + "Emp Hr :" +empHrs);
      
      }

      int totalEmpWage = totalEmpHrs * empRatePerHour;
      System.out.println("Total Emp Wage  for company : " + company + "is :" + totalEmpWage);
      return 0;
    }

   public static void main(String args[]){

      System.out.println("Welcome to Employee Wage Problem");
      EmpWageComputation employee= new EmpWageComputation();
      employee.computeEmpWage("Dmart" ,20,2,20);
   
   }

}