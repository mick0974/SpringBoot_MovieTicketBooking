package com.praveen.springboottiketbookings.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableMovie")
@EntityListeners(AuditingEntityListener.class)
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long movieId;
	
	@NotBlank
	private String movieName;
	
	@NotBlank
	private String director;
	
	
	private String description;
	
	@OneToMany(mappedBy = "theMovie")
	public List<Show> theShow;

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long m_id) {
		movieId = m_id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String m_name) {
		movieName = m_name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String m_director) {
		director = m_director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String m_description) {
		description = m_description;
	}
	
	
	
}
