package com.movie.movie_info_service.controller;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import com.movie.movie_info_service.models.Movie;
import com.movie.movie_info_service.models.MovieSummary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping({"/movies"})
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping({"/{movieId}"})
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
       // MovieSummary movieSummary=restTemplate.getForObject("https://api.themoviedb.org/3/movie" +movieId +"?api_key=" + apiKey,MovieSummary.class);
        return new Movie(movieId,"testname");
    }
}
