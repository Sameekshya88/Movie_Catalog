package com.movie.movie_catalog_service.Service;

import com.movie.movie_catalog_service.models.UserRating;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserRatingInfo {
    private RestTemplate restTemplate;
	

    public UserRatingInfo(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
   public UserRating getUserRating(String userId)
   {
       return restTemplate.getForObject("http://localhost:8083/ratingdata/user/" + userId,UserRating.class);
   }
	public List<String> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
   
   
}
