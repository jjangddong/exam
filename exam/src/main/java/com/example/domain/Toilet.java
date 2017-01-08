package com.example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Toilet {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column(length=100, nullable = true,updatable = true)
	private String gubun;
	
	@Column(length=100, nullable = false,updatable = true)
	private String name;
	
	@Column(length=100, nullable = false,updatable = true)
	private String address;
	
	@Column(length=100, nullable = false,updatable = true)
	private double longitude;
	
	@Column(length=100, nullable = false,updatable = true)
	private double latitude;

	public Toilet() {
		
	}
	
	public String getGubun() {
		return gubun;
	}

	public void setGubun(String gubun) {
		this.gubun = gubun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Toilet [id=" + id + ", gubun=" + gubun + ", name=" + name
				+ ", address=" + address + ", longitude=" + longitude
				+ ", latitude=" + latitude + "]";
	}
}
