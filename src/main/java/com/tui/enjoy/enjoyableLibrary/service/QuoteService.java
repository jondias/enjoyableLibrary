package com.tui.enjoy.enjoyableLibrary.service;

import com.tui.enjoy.enjoyableLibrary.model.Quote;
import com.tui.enjoy.enjoyableLibrary.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

  @Autowired
  private QuoteRepository quoteRepository;

  @CacheEvict(value="quote")
  public Quote getAll(final String id) {
    return quoteRepository.findById(id).orElse(null);
  }

}
