package com.sethkraut.moviequotes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;
import java.util.List;

@Repository
@RepositoryRestResource
public interface MovieQuoteRepository extends MongoRepository<MovieQuote, String> {
    @RestResource(path = "quoteContains", rel = "quoteContains")
    List<MovieQuote> findAllByQuoteContaining(@Param("text") String text, Pageable p);
}
