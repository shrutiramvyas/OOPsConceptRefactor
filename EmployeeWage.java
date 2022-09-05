class ClassEmployee {
    public static final int full_time=2;
    public static final int part_time=1;
    public int emp_rate_per_hour;
    public int emphrs=0;
    public int empwage=0;
    ClassEmployee(int wage_per_hour){
        this.emp_rate_per_hour=wage_per_hour;
    }
    public int calc() {
        int empcheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empcheck) {
            case part_time:
                emphrs = 4;
                break;
            case full_time:
                emphrs = 8;
                break;
            default:
                emphrs = 0;
        }
        empwage = emphrs * emp_rate_per_hour;
        return empwage;

    }
}
class Main{
    public static void main(String[] args) {
        int wage_per_hour=20;
        ClassEmployee emp =new ClassEmployee(wage_per_hour);
        System.out.println("Total wages of employee is: " + emp.calc());

    }
}