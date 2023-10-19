package one.digitalinnovation.usersignupapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UserSignUpApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSignUpApiApplication.class, args);
	}

}
