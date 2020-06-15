import java.util.LinkedList;
public class ComputeEmpWage implements ICompanyEmpWage {
    
   public static final int IS_EMP_FULL_TIME = 1;
   public static final int IS_EMP_PART_TIME = 2;
   private int numOfCompany = 0;
   private LinkedList<CompanyEmpWage> companyEmpWageList;
   
   public ComputeEmpWage(){
        companyEmpWageList = new LinkedList<>();
   }
   
    public void addCompanyEmpWage( String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours ){

          CompanyEmpWage companyEmpWage  = new CompanyEmpWage( company, empRatePerHour, workingDaysInMonth, maximunWorkHours );
        companyEmpWageList.add(companyEmpWage);
    }
    
    private void getMonthlyWage(){
        for(int i = 0; i < companyEmpWageList.size(); i++) 
        {
            CompanyEmpWage  companyEmpWage = companyEmpWageList.get(i);
            // companyEmpWage.setTotalEmpwage(t)
            System.out.println(companyEmpWage);
        }
    }
    
   private int getMonthlyWage( CompanyEmpWage companyEmpWage ){
     int totalEmpHours = 0, empHours = 0;
     int totalWorkingDays = 0;
     while (totalEmpHours <= companyEmpWage.maximunWorkHours && totalWorkingDays < companyEmpWage.workingDaysInMonth )
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_EMP_FULL_TIME: 
                 empHours = 8 ;
                  break ;
                case IS_EMP_PART_TIME: 
                 empHours = 4 ;
                   break ;
                default: empHours=0  ;
            }
            totalEmpHours += empHours;
            
            System.out.println("Day " + totalWorkingDays + " EmpHours= "+ empHours);
        }
        return totalEmpHours * companyEmpWage.empRatePerHour; 
   }

   public static void main(String args[]){
      System.out.println("\nWelcome to Employee Wage Computation/Problem");
      ComputeEmpWage employee = new ComputeEmpWage();
      employee.addCompanyEmpWage("DMART",20,2,10);
      employee.addCompanyEmpWage("TrendBazaar",10,4,20);
      employee. getMonthlyWage();
   }
}
