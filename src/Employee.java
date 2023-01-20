import java.util.Objects;

public class Employee {
    private final String nameSurname;
    private int salary;
    private int department;
    public static int counter = 0;
    private int id;

    public Employee(String nameSurname, int department, int salary, int id) {
        this.nameSurname = nameSurname;
        this.id = counter++;
        this.department = department;
        this.salary = salary;
    }

    public String getNameSurname() {
        return this.nameSurname;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameSurname, salary, department, id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(nameSurname, employee.nameSurname) && Objects.equals(department, employee.department);
    }

    @Override
    public String toString() {
        return
                "ФИО - " + nameSurname +
                ", Зарплата - " + salary +
                ", Отдел - " + department +
                ", id - " + id + "";
    }
}