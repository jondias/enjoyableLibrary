package com.tui.enjoy.enjoyableLibrary.controller;

import com.tui.enjoy.enjoyableLibrary.model.Quote;
import com.tui.enjoy.enjoyableLibrary.repository.QuoteRepository;
import com.tui.enjoy.enjoyableLibrary.service.QuoteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/quote")
public class QuoteController {

  @Autowired
  private QuoteRepository quoteRepository;

  @Autowired
  private QuoteService quoteService;

  @GetMapping("/cache/{id}")
  public ResponseEntity<Quote> getCache(@PathVariable final String id) {
    try {
      final Quote quotesResult = quoteService.getAll(id);

      return new ResponseEntity<>(quotesResult, HttpStatus.OK);
    } catch (final Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/all")
  public ResponseEntity<List<Quote>> getAll() {
    try {
      final List<Quote> quotesResult = quoteRepository.findAll();

      if (quotesResult.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<>(quotesResult, HttpStatus.OK);
    } catch (final Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/{id}")
  public ResponseEntity<Quote> getById(@PathVariable final String id) {
    try {
      final Quote quoteResult = quoteRepository.findById(id).orElse(null);

      if (quoteResult == null) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<Quote>(quoteResult, HttpStatus.OK);
    } catch (final Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/author/{author}")
  public ResponseEntity<List<Quote>> getByAuthor(@PathVariable final String author) {
    try {
      final List<Quote> quotesResult = quoteRepository.findByAuthor(author);

      if (quotesResult.isEmpty()) {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      }

      return new ResponseEntity<List<Quote>>(quotesResult, HttpStatus.OK);
    } catch (final Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }


}
