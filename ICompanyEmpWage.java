import java.util.ArrayList;

 
public interface EmpWageICompute
{
    public static final int IS_EMP_FULL_TIME = 1;
    public static final int IS_EMP_PART_TIME = 2;
    public void addCompanyEmployee(String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours);
    public void getDailyWage();
    public int getMonthlyWage(CompanyEmpWage company );
}

class CompanyEmpWage
{
        public final String company;
        public final int empRatePerHour;
        public final int workingDaysInMonth;
        public final int maximunWorkHours;
        public int totalEmpWage;
        int totalSalary;
        public ArrayList<Integer> dailyWage = new ArrayList<>();
        public CompanyEmpWage( String company, int empRatePerHour, int workingDaysInMonth, int maximunWorkHours )
        {
            this.company = company;
            this.empRatePerHour = empRatePerHour;
            this.workingDaysInMonth = workingDaysInMonth;
            this.maximunWorkHours = maximunWorkHours;
        }

    public void getTotalWage(int totalSalary )
    {
        this.totalSalary = totalSalary;
    }
    public void storeDailyWage(ArrayList<Integer> dailyWage )
    {
        this.dailyWage = dailyWage;
    }   
}
        return ("Total Emp Wage for Company: " +company+ " is: " + totalEmpWage);
    }
}
