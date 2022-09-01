public class EmployeeWage {
    public static int total_wage_hour = 0;
    public static int wage_per_hour=20;
    public static int working_hour=8;
    public static int randomval() {
        int empcheck = (int) (Math.random() * 10 % 2);
        return empcheck;
    }
        public static int calc() {
        int isPresent=randomval();
            if (isPresent == 1) {
                total_wage_hour = working_hour * wage_per_hour;
            }
            return total_wage_hour;
        }

    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        System.out.println("Total Employee wage is :"+emp.calc());
    }
}