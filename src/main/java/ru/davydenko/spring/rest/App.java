package ru.davydenko.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.davydenko.spring.rest.configuration.MyConfig;
import ru.davydenko.spring.rest.entity.Employee;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "Salary", 1000);
//        employee.setId(6);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(7);

    }
}
