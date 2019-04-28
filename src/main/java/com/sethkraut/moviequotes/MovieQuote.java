package com.sethkraut.moviequotes;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
@TypeAlias("MovieQuote")
@Data
public class MovieQuote {
    private String id;
    private String quote;
    private String character;
    private String movie;
}
