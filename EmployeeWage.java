class ClassEmployee {
    public static final int part_time = 1;
    public static final int full_time = 2;
    public static final int emp_rate_per_hour = 20;
    public static final int no_of_working_days = 20;

    public int calc() {
        int emp_hours = 0, total_working_days = 0;
        while (total_working_days < no_of_working_days) {
            total_working_days++;
            int empcheck = (int) Math.floor(Math.random() * 10 % 3);
            switch (empcheck) {
                case part_time:
                    emp_hours = 4;
                    break;
                case full_time:
                    emp_hours = 8;
                    break;
                default:
                    emp_hours = 0;
            }
        }
        int totalEmpWages = emp_hours * emp_rate_per_hour;
        return totalEmpWages;
    }
}

class Main{
    public static void main(String[] args) {
        ClassEmployee emp =new ClassEmployee();
        System.out.println("Total wages of employee is: " + emp.calc());

    }
}