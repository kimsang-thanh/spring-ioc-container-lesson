package kh.edu.cstad.account;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class AnnotationConfig {




    public void printStudent() {
        Student student = new Student();
        student.setId(1);
        student.setFullName("Kimsang");
        student.setScore(90.5);
        System.out.println("Student: " + student);

    }
}
