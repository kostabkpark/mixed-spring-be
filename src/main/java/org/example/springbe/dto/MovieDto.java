package org.example.springbe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
  private int id;
  private String title;
  private String medium_cover_image;
  private String summary;
}

