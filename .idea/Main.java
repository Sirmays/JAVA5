public class Main {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];

        addEmployees(empArr);
        checkForty(empArr);
    }

    static void checkForty(Employee[] empArr) {
        System.out.println("Employees over 40 yo:");
        for (Employee employee : empArr) {
            if (employee.age > 40) {
                employee.showEmplInfo();
                System.out.println("");
            }
        }
    }

    static void addEmployees(Employee[] empArr) {
        empArr[0] = new Employee("Petrov Petr", "doctor", "petrov@company.com", "79035876987", 50000, 35);
        empArr[1] = new Employee("Mask Ilon", "director", "mask@company.com", "79035876897", 350000, 49);
        empArr[2] = new Employee("Brysev Andrey", "consultant", "brysev@company.com", "447576539132", 150000, 36);
        empArr[3] = new Employee("Bogachev Roman", "driver", "bogachev@company.com", "79035879717", 40000, 42);
        empArr[4] = new Employee("Zaytsev Kot", "engineer", "zaytsev@company.com", "79055876987", 100000, 2);
    }


 //   static void createEmployees() {
 //       Employee Ivanov = new Employee("Ivanov Ivan", "worker", "ivanov@company.com", "79265589878", 20000, 25);
 //       Ivanov.showEmplInfo();
 //   }

}
