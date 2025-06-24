package com.movie.movie_catalog_service.Service;

import com.movie.movie_catalog_service.models.CatalogItem;
import com.movie.movie_catalog_service.models.Movie;
import com.movie.movie_catalog_service.models.RatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieInfo {
    @Autowired
    private RestTemplate restTemplate;

    public MovieInfo(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

   public CatalogItem getCatalogItem(RatingData rating)
   {
        Movie movie =restTemplate.getForObject("https://localhost:8081/movies/foo"+rating.getMovieId(), Movie.class);
        return new CatalogItem(movie.getName(),movie.getDescription(),rating.getRating());

   }
}
