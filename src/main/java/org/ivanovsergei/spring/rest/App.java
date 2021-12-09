package org.ivanovsergei.spring.rest;

import org.ivanovsergei.spring.rest.configuration.Communication;
import org.ivanovsergei.spring.rest.configuration.MyConfig;
import org.ivanovsergei.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args ){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();//показывает список работников
//        System.out.println(allEmployees);

//        Employee empById = communication.getEmployee(1);//показывает одного работника
//        System.out.println(empById);

        //добавление работника в бд через пут
//        Employee emp =  new Employee("Sveta", "Sokolova", "HR", 900);
//        emp.setId(13);//апдейтим
//        communication.saveEmployee(emp);

        //удаление работника
        communication.deleteEmployee(13);
    }

}
