package test.jenkins.pipeline.controller;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/world")
    public String helloWorld(){

        return "Hello World! And PipeLine";
    }
}
