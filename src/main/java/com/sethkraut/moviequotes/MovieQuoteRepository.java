package com.sethkraut.moviequotes;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource
public interface MovieQuoteRepository extends MongoRepository<MovieQuote, String> {
}
