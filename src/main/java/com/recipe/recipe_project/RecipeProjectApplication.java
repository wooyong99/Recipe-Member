package com.recipe.recipe_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RecipeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeProjectApplication.class, args);
	}

}
