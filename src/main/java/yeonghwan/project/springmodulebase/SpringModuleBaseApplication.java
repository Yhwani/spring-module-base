package yeonghwan.project.springmodulebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringModuleBaseApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringModuleBaseApplication.class, args);
	}

}
