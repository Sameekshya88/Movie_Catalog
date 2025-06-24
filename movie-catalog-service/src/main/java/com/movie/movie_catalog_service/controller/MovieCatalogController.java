package com.movie.movie_catalog_service.controller;



import com.movie.movie_catalog_service.models.Movie;
import com.movie.movie_catalog_service.models.RatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.movie.movie_catalog_service.Service.MovieInfo;
import com.movie.movie_catalog_service.Service.UserRatingInfo;
import com.movie.movie_catalog_service.models.CatalogItem;

import com.movie.movie_catalog_service.models.Movie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
//
//	@Autowired
//	private UserRatingInfo userRatingInfo;
//
//	@Autowired
//	private MovieInfo movieInfo;
//    @Autowired
//    private Movie movie;
    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
        //get all the ids with rating
        RestTemplate resttemplate=new RestTemplate();

        List<RatingData> ratings= Arrays.asList(new RatingData("1234",3)
        ,new RatingData("3456",5));


        return ratings.stream().map(rating-> {
            Movie movie=resttemplate.getForObject("https://localhost:8081/movies/foo", Movie.class);
            return new CatalogItem(movie.getName(),"test",rating.getRating());
            }).collect(Collectors.toList());
     //        UserRating userRating = userRatingInfo.getUserRating(userId);
//
//        return userRating.getRatings().stream()
//                .map(rating -> movieInfo.getCatalogItem(rating))
//                .collect(Collectors.toList());


    }

    
}
