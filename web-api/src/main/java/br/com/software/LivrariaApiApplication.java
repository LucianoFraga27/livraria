package br.com.software;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"br.com.software.*"})
@SpringBootApplication
public class LivrariaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(LivrariaApiApplication.class, args);
    }
}
