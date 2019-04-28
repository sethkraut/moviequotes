package com.sethkraut.moviequotes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@EnableSwagger2WebMvc
@SpringBootApplication
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
public class MovieQuoteApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MovieQuoteApplication.class, args);
    }
}
