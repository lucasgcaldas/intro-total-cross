package com.totalcross;

import com.totalcross.entities.Manager;
import com.totalcross.entities.Student;
import com.totalcross.entities.Teacher;
import totalcross.TotalCrossApplication;

public class RunTotalCrossProjectApplication {
    public static void main(String[] args) {
        TotalCrossApplication.run(TotalCrossProject.class, "/r", "5443444B5AAEEB90306B00E4");

        Student student = new Student("Lucas");
        System.out.println("Student code is: " + student.generateCode());

        Teacher teacher = new Teacher("Munoz");
        System.out.println("Teacher code is: " + teacher.generateCode());

        Manager manager = new Manager("Patrícia");
        System.out.println("Manager code is: " + manager.generateCode());
    }
}
