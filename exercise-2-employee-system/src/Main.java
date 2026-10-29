public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Employee_1", "Ali", 2000);
        employees[1] = new FullTimeEmployee("Employee_2(full time)", "Sara", 3000, 500, 200);
        employees[2] = new PartTimeEmployee("Employee_3(part-time)", "Reza", 40, 25);
    }
}