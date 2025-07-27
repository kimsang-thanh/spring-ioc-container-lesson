package kh.edu.cstad.account;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController  // Bean handle http request
@RequiredArgsConstructor
public class TestController {

    private final List<Student> students;
    private final InMemoryDatabase inMemoryDatabase;


    @GetMapping("/add")
    public void add() {
        Student student = new Student();
        student.setId(4);
        student.setFullName("Ly");
        student.setScore(99.9);
        inMemoryDatabase.insert(student);
    }

    @GetMapping("/api/test")
    public List<Student> test() {
        return students;
    }

}
