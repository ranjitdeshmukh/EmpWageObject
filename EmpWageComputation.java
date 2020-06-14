import java.util.Random;


public class EmpWageComputation{

 public static final int IS_EMP_FULL_TIME = 1;
 public static final int IS_EMP_PART_TIME = 2;
 private final String company ;
 private final int empRatePerHour;
 private final int numOfWorkingDays; 
 private final int maxHoursPerMonth;
 private int totalEmpWage;

 public  EmpWageComputation(String company ,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
  this.company = company ;
  this.empRatePerHour=empRatePerHour;
  this.numOfWorkingDays=numOfWorkingDays; 
  this.maxHoursPerMonth=maxHoursPerMonth;

}

public void EmpWage(){

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

  totalEmpWage = totalEmpHrs * empRatePerHour;
}

 @Override
  public String toString(){
    
   return "Total Emp Wage  for company : " + company + "is :" + totalEmpWage;
   
 }
public static void main(String args[]){

  System.out.println("Welcome to Employee Wage Problem");
      // EmpWageComputation employee = new EmpWageComputation();
  EmpWageComputation employee =   new EmpWageComputation("Dmart" ,20,2,20);
  employee.EmpWage();
}

}