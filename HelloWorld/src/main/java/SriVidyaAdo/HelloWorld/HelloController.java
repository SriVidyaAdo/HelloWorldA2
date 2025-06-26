package SriVidyaAdo.HelloWorld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @CrossOrigin(origins = "*") // Allows frontend requests from anywhere (good for testing)
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
