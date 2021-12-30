package com.tui.enjoy.enjoyableLibrary.repository;

import com.tui.enjoy.enjoyableLibrary.model.Quote;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuoteRepository extends MongoRepository<Quote, String> {

  List<Quote> findByAuthor(String author);

}
