package revature.ProjectManagementAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProjectManagementApiApplication {
	/**
	 * I'm just making a change so that we will have a change to push!
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProjectManagementApiApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
}
