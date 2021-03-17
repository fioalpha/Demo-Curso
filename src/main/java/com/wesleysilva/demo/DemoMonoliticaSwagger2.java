package com.wesleysilva.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class DemoMonoliticaSwagger2 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoMonoliticaSwagger2.class, args);
	}

	@Bean
	public springfox.documentation.spring.web.plugins.Docket docket() {
		Docket docket = new Docket(springfox.documentation.spi.DocumentationType.SWAGGER_2);
		return docket.apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		@SuppressWarnings("deprecation")
		ApiInfo apiInfo = new ApiInfo("Acme Producer (AP) REST API", "Lista de serviços da empresa AP para integração", "Versão API 1.0",
				"Termos de uso", "aluno@e-mail.com", "API License", "API License URL");
		return apiInfo;
	}

}
