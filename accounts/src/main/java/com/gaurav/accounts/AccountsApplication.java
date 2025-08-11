package com.gaurav.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.gaurav.accounts.controller") })
@EnableJpaRepositories("com.gaurav.accounts.repository")
@EntityScan("com.gaurav.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "GSBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Gaurav Salunke",
						email = "tutor@gaurav.com",
						url = "https://www.gaurav.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.gaurav.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "GSBank Accounts microservice REST API Documentation",
				url = "https://www.gaurav.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
