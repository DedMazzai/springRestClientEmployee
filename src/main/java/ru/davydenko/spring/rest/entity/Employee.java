package ru.davydenko.spring.rest.entity;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private String department;
    private int salary;
    public Employee() {
    }

    public Employee(String nameEmployee, String surnameEmployee, String department, int salary) {
        this.name = nameEmployee;
        this.surname = surnameEmployee;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameEmployee) {
        this.name = nameEmployee;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surnameEmployee) {
        this.surname = surnameEmployee;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
