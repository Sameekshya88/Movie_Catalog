package com.movie.ratings_data_service.controller;


import com.movie.ratings_data_service.Repository.RatingRepository;
import com.movie.ratings_data_service.models.RatingData;
import com.movie.ratings_data_service.models.UserRating;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {


    private RatingRepository UserRepo;

    @RequestMapping("/{movieId}")
    public RatingData getRating(@PathVariable("movieId") String movieId)
    {
       return new RatingData(movieId,4);
    }
   @RequestMapping(path="user/{userId}",method = RequestMethod.GET)
    public UserRating getUserRatings(@PathVariable("userId") String userId)
   {
       return UserRepo.findByUserId(userId);
   }

}
