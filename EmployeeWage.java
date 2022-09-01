public class EmployeeWage {
    public static int randomval() {
        int empcheck = (int) (Math.random() * 10 % 2);
        return empcheck;
    }
    public static void main(String[] args) {
        EmployeeWage emp = new EmployeeWage();
        int chk = emp.randomval();
        if (chk == 0) {
            System.out.println("Employee is present");
        } else {
            System.out.println("Employee is absent");
        }
    }
}