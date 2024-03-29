package dev.ram.movies;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection ="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
	private Object id;
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private String poster;
	private List<String> genres;
	private  List<String> backgroups;
	@DocumentReference
	private List<Review> reviewIds;
}
