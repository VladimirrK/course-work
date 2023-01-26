public class EmployeesList {
    public static void main(String[] args) {
        listOfEmployees();
    }

    public static void listOfEmployees() {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Василий Иванович", 1, 54600, Employee.counter);
        employees[1] = new Employee("Игорь Петрович", 3, 61200, Employee.counter);
        employees[2] = new Employee("Евгений Дмитриевич", 2, 48300, Employee.counter);
        employees[3] = new Employee("Пётр Петрович", 4, 36900, Employee.counter);
        employees[4] = new Employee("Василий Геннадьевич", 5, 74100, Employee.counter);

        informationForAllEmployees(employees);
        sumSalary(employees);
        findMinSalary(employees);
        findMaxSalary(employees);
        nameOfEmployees(employees);
        averageSalary(employees);
    }

    public static void informationForAllEmployees(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i);
        }
        System.out.println("---------------");
    }


    public static void sumSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц составила - " + sum);
        System.out.println("---------------");
    }

    public static void findMinSalary(Employee[] employees) {
        Employee min = employees[0];
        int minSalary = min.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                min = employee;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + min);
        System.out.println("---------------");
    }
    public static void findMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        int maxSalary = max.getSalary();
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + max);
        System.out.println("---------------");
    }

    public static void averageSalary(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }

        int average = sum / Employee.getCounter();
        System.out.println("Среднее значение зарплат - " + average);
        System.out.println("---------------");
    }

    public static void nameOfEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getNameSurname());
        }
    }
}
