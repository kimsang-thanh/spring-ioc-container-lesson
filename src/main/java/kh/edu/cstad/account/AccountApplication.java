package kh.edu.cstad.account;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RequiredArgsConstructor
public class AccountApplication implements CommandLineRunner {

    // required dependency
    // 1. Declare dependency variable
    private final AnnotationConfig config;
    private  final AnnotationConfig config2;

    // optional dependency
    private Student student;

    @Autowired
    @Qualifier("s2")
    public void setStudent(Student student) {
        this.student = student;
    }

    // 2. Define dependency -> DI
    public AccountApplication(AnnotationConfig config, AnnotationConfig config2) {

        this.config = config;
        this.config2 = config2;
    }


    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }


    // dynamic port
    @Value("${server.port}")
    public Integer appPort;

    @Value("${istad.username}")
    public String istadUsername;

    @Value("${istad.pasoword}")
    public String istadPassword;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(appPort);
        System.out.println(istadUsername + " " + istadPassword);
//        System.out.println(config);
//        System.out.println( config2);

//        System.out.println(student);
    }
}