package dev.ram.movies;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
	@Id
	private Object id;
	private String body;
	private LocalDateTime created;
	private LocalDateTime updated;
	
	public Review(String body,LocalDateTime created,LocalDateTime updated) {
		this.body = body;
		this.created=created;
		this.updated=updated;
	}

}
