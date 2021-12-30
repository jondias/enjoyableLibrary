package com.tui.enjoy.enjoyableLibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "quote")
public class Quote {

  @Id
  private String id;

  @Field("quoteText")
  private String text;
  @Field("quoteAuthor")
  private String author;
  @Field("quoteGenre")
  private String genre;

  @Version
  @Field("__v")
  private Long version;

}
