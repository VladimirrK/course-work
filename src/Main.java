import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        listOfEmployees();
    }

    public static void listOfEmployees() {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Василий Иванович", 1, 54600, Employee.counter);
        employee[1] = new Employee("Игорь Петрович", 3, 61200, Employee.counter);
        employee[2] = new Employee("Евгений Дмитриевич", 2, 48300, Employee.counter);
        employee[3] = new Employee("Пётр Петрович", 4, 36900, Employee.counter);
        employee[4] = new Employee("Василий Геннадьевич", 5, 74100, Employee.counter);

        informationForAllEmployees(employee);
        printSumSalary(employee);
        printMinSalary(employee);
    }

    public static void informationForAllEmployees(Employee[] employee) {
        for (Employee i : employee) {
            System.out.println(i);
        }
    }

    public static void printSumSalary(Employee[] employee) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составила - " + sum);
    }

    public static void printMinSalary(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (i < employee[i].getSalary()) {
                i = employee[i].getSalary();
            }
            System.out.println("Сотрудник с минимальной зарплатой - " + employee[i].getSalary());
        }
    }
}w