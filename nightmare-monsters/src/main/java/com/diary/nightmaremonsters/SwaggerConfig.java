package com.diary.nightmaremonsters;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	@Bean
	public Docket swagger(TypeResolver typeResolver) {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.diary.nightmaremonsters")).paths(PathSelectors.any()).build().apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Nightmare Monsters Rest Api", "Rest API focused on creating monsters and worlds taken from the incredibly insane human brain.", "1.0.0", "Terms of Service", new Contact("Marlon Rodrigues", "www.linkedin.com/in/marlinsk", "marlonsrrodrigues@gmail.com"), "Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", new ArrayList<VendorExtension>());
		return apiInfo;
	}
}
