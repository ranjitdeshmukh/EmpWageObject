import java.util.Random;
public class EmployeeEmpWage{

 private final String company ;
 private final int empRatePerHour;
 private final int numOfWorkingDays; 
 private final int maxHoursPerMonth;
 private int totalEmpWage;


 public  EmployeeEmpWage(String company ,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
  this.company = company ;
  this.empRatePerHour=empRatePerHour;
  this.numOfWorkingDays=numOfWorkingDays; 
  this.maxHoursPerMonth=maxHoursPerMonth;

}

public void setTotalEmpWage(int totalEmpWage){
  this.totalEmpWage=totalEmpWage;
}


@Override
public String toString(){

 return "Total Emp Wage  for company : " + company + "is :" + totalEmpWage; 

}

}


public class EmpWageComputationArray{

 public static final int IS_EMP_FULL_TIME = 1;
 public static final int IS_EMP_PART_TIME = 2;
 private int numOfCompany= 0;

 private CompanyEmpWage[] EmpWageComputationArray;

 public EmpWageComputationArray(){

   EmpWageComputationArray  = new CompanyEmpWage[5];

 }

 private void addCompanyEmpWage(String company ,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
  
  EmpWageComputationArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
  numOfCompany++;

 }

 private void computeEmpWage(){

  for (int i=0 ;i< numOfCompany ;i++ ) {

    EmpWageComputationArrayp[i].setTotalEmpWage(this.computeEmpWage(EmpWageComputationArray[i]));
    System.out.println(EmpWageComputationArray[i]);
    
  }
 
 }
 private int computeEmpWage(EmployeeEmpWage,EmployeeEmpWage){

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


public static void main(String args[]){
  System.out.println("Welcome to Employee Wage Problem");
  EmpWageComputationArray employee =   new EmpWageComputationArray();
  employee.addCompanyEmpWage("Dmart" ,20,2,20);
  employee.computeEmpWage();
}

}