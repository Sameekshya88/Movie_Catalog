package com.movie.movie_catalog_service.models;

import java.util.List;

public class UserRating {

    private String userId;
    private List<RatingData> ratings;

    public UserRating() {
    }

    public UserRating(String userId, List<RatingData> ratings) {
        this.userId = userId;
        this.ratings = ratings;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<RatingData> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingData> ratings) {
        this.ratings = ratings;
    }
}

