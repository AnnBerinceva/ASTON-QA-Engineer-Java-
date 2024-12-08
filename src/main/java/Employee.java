public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo(){
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Номер телефона: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich", "Frontend developer", "test@mail.ru","8-123-456-789", 75000.55, 32);
        employees[1] = new Employee("Petrov Petr Petrovich", "QA", "Petrov@mail.ru","005-006", 180000.0, 37);
        employees[2] = new Employee("Sidorov Sidor Sidorovich", "QA-engineer", "Sidorov2000@mail.ru","123", 75000.55, 24);
        employees[3] = new Employee("Кузнецов Кузьма Кузнецович", "Разработчик", "kuznetsov@mail.com", "444-555-6666", 62000, 27);
        employees[4] = new Employee("Иванова Ольга Александровна", "Аналитик", "ivanovaOA@example.com", "111-222-3333", 58000, 35);
        System.out.println("Данные из массива: ");
        System.out.println();

        for (Employee employee : employees){
            employee.printInfo();
            System.out.println("--------------------------------");
        }
    }
}