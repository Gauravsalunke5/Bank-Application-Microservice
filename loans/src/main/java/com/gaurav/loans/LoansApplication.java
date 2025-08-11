package com.gaurav.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.gaurav.loans.controller") })
@EnableJpaRepositories("com.gaurav.loans.repository")
@EntityScan("com.gaurav.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "GSBank Loans microservice REST API Documentation",
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
				description = "GSBank Loans microservice REST API Documentation",
				url = "https://www.gaurav.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
