package kh.edu.cstad.account;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


// java-base configuration = customize object Student class
@Configuration
//@RequiredArgsConstructor
public class InMemoryDatabase {
    private List<Student> data;


    public InMemoryDatabase(){
        Student student = new Student();
        student.setId(2);
        student.setFullName("Kanha");
        student.setScore(99.9);
        Student student2 = new Student();
        student2.setId(3);
        student2.setFullName("Vichka");
        student2.setScore(95.9);
        this.data = new ArrayList<>();
        this.data.add(student);
        this.data.add(student2);
    }

    public void insert(Student student){
        this.data.add(student);
    }

    @Bean
   public List<Student> students(){
        return data;
    }

    @Bean("s1")
    public Student student1() {
        Student student = new Student();
        student.setId(2);
        student.setFullName("Kanha");
        student.setScore(99.9);
        return student;
    }

    @Bean("s2")
    public Student student2() {
        Student student = new Student();
        student.setId(3);
        student.setFullName("Vichka");
        student.setScore(95.9);
        return student;
    }
}
