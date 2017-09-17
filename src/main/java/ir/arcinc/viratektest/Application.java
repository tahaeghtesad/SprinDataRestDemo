package ir.arcinc.viratektest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        org.springframework.context.ApplicationContext context = SpringApplication.run(Application.class, args);
    }
}
