 package com.praveen.springboottiketbookings.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
//import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="tableCity")
@EntityListeners(AuditingEntityListener.class)
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cityId;
	
	@Column(nullable=false)
	@NotBlank
	private String cityName;
	
	@NotBlank
	private String pincode;
	
	@NotBlank
	private String state;
	
	@OneToMany(mappedBy="city")
	private List<Theater> theTheater;

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long iD) {
		cityId = iD;
	}

	public String getName() {
		return cityName;
	}

	public void setName(String name) {
		this.cityName = name;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
