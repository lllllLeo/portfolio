package me.yujun.springcorsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcorsserverApplication {

    @CrossOrigin(origins = "http://localhost:18080") //scheme + hostname + port 다 origin에 해당하는 것이다.
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringcorsserverApplication.class, args);
    }
}
