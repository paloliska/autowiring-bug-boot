package sk.liska.autowiringbug;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class AutowiringBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutowiringBugApplication.class, args);
	}
}
