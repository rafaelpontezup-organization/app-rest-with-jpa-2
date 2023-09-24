package br.com.zup.edu.apprestwithjpa2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = ErrorMvcAutoConfiguration.class) // Needed by Zalando Problem lib
public class AppRestWithJpa2Application {

	public static void main(String[] args) {
		SpringApplication.run(AppRestWithJpa2Application.class, args);
	}

}
