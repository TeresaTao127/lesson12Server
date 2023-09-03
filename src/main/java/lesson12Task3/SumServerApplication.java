package lesson12Task3;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SumServerApplication.class, args);
    }
}
