package com.praveen.springboottiketbookings.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tableTheater")
@EntityListeners(AuditingEntityListener.class)

public class Theater {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long theaterId;
	
	@NotBlank
	private String theaterName;
	
	@NotBlank
	private String theaterArea;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private City city;
	
	/*First version of creating many to one relationship between theater and movie entity*/
//	@ManyToMany(cascade = {CascadeType.ALL})
//	@JoinTable(
//			name = "theater_movie",
//			joinColumns = {
//					@JoinColumn(name = "T_id")
//			},
//			inverseJoinColumns = {
//					@JoinColumn(name = "M_id")
//			}
//	)
//	Set <Movie> movies = new HashSet	< Movie > (); 
//	
	
	@OneToMany(mappedBy = "theTheater")
	private List<Show> theShow;
	
	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterArea() {
		return theaterArea;
	}

	public void setTheaterArea(String theaterArea) {
		this.theaterArea = theaterArea;
	}
	
	
	

}
