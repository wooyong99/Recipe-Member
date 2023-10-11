package com.recipe.recipe_project.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto {
  private String access_token;
  private String refresh_token;
}
