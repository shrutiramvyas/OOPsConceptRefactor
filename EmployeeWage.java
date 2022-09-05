public class EmployeeWage {
    public int full_time=2;
    public int part_time=1;
    public static int total_wage_hour = 0;
    public static int wage_per_hour=20;
    public static int working_hour=8;
    public int emphrs=0;
    public int empwage=0;
    public int emp_rate_per_hour=20;
    public static int randomval() {
        int empcheck = (int) (Math.random() * 10 % 2);
        return empcheck;
    }
    public int calc(){
        double empcheck =Math.floor(Math.random()*10)%3;
        if(empcheck==part_time) {
            emphrs = 4;
        }
        else if(empcheck==full_time) {
            emphrs = 8;
        }
        else{
            emphrs=0;
        }
        empwage=emphrs*emp_rate_per_hour;
        return empwage;
    }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        System.out.println("Total Employee wage is :"+emp.calc());
    }
}