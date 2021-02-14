public class Employee {
    public String name;
    public String position;
    public String email;
    public String phone;
    public int salary;
    public int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void showEmplInfo() {
        System.out.printf(" name: %s%n position: %s%n e-mail: %s%n phone number: %s%n salary: %s%n age: %s%n", name, position, email, phone, salary, age);
    }
}

