import java.util.Random;
public class EmpWageComputation{

   public static final int IS_EMP_FULL_TIME = 1;
   public static final int IS_EMP_PART_TIME = 2;
   public static final int EMP_RATE_PER_HOUR = 10;
   public static final int WORKING_DAYS_IN_MONTH = 20;
   public static final int MAXIMUM_WORK_HOURS = 100;
   
   public static int totalEmpHours = 0;
   public static int totalSalary = 0;
   public static int totalWorkingDays = 0;
   public static int empHours = 0;
   public static int dailyWage = 0;

   
   public static int getWorkingHours(int empCheck){
      switch (empCheck){

         case IS_EMP_FULL_TIME:  
             empHours = 8;
              break ;
         case IS_EMP_PART_TIME:  
              empHours = 4 ;
               break ;
         default: 
               empHours=0  ;
      }

      return empHours;
   }

   public static int getCalculationDailyWage(int empHours){

      dailyWage = empHours * EMP_RATE_PER_HOUR;
      return dailyWage;
   
   }

   public static void getMonthlyWage(){

      int empDailyWage[] = new int[21];
      
      while (totalEmpHours <= MAXIMUM_WORK_HOURS && totalWorkingDays < WORKING_DAYS_IN_MONTH){

         Random random = new Random();
         int empCheck = random.nextInt()%3;
         empHours = getWorkingHours(empCheck);
         totalEmpHours = totalEmpHours + empHours;
         totalWorkingDays++;
         empDailyWage[totalWorkingDays]=getCalculationDailyWage(empHours);
         
      }

      System.out.println("Day No.   DailyWage   TotalWage");

      for (int i = 0; i < empDailyWage.length; i++) {           
           int x= empDailyWage[i];
           totalSalary +=x;
           System.out.println( "day : "+ i + "       " + x + "         " + totalSalary ); 

         }
         System.out.println("Total salary of employee= " + totalSalary);
   }

   public static void main(String args[]){

      System.out.println("Welcome to Employee Wage Problem");
      EmpWageComputation employee= new EmpWageComputation();
      employee.getMonthlyWage();
   
   }

}