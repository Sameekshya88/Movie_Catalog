package com.movie.ratings_data_service.Repository;

import com.movie.ratings_data_service.models.UserRating;
import org.apache.catalina.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<UserRating,String>
{
    UserRating findByUserId(String id);

}
