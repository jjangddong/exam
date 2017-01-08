package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Toilet;
import com.example.repository.SearchRepository;
import com.example.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService {
	
	@Autowired
	private SearchRepository repository;
	
	public List<Toilet> getToiletPoiInfo(String slocation, String elocation) {
		
		String sloc[] = slocation.split("\\|");
		String eloc[] = elocation.split("\\|");
		
		double sx = Double.parseDouble(sloc[0]);
		double ex = Double.parseDouble(eloc[0]);
		double sy = Double.parseDouble(sloc[1]);
		double ey = Double.parseDouble(eloc[1]);
		
		return repository.findToiletByLongitudeAndLatitude(sx, ex, sy, ey);
	}
}
