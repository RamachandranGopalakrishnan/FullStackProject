package dev.ram.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRespository extends MongoRepository<Movie,ObjectId>{

	 Optional<Movie> findMovieByImdbId(String imdbId);


}
