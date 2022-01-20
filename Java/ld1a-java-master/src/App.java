public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("*****************");
        // An object is an occurance of a class.
        Employee employee1 = new Employee();
        employee1.employeeId = 100;
        employee1.first_name = "Rambo";

        Employee employee2 = new Employee();
        employee2.employeeId = 101;
        employee2.first_name = "John";

        // Print the object values
        System.out.println(employee1.employeeId);
        System.out.println(employee1.first_name);
        System.out.println(employee2.employeeId);
        System.out.println(employee2.first_name);

        employee1.doWork();
        employee2.doWork();   
    }
}
