package com.example.service;

import java.util.List;

import com.example.domain.Toilet;

public interface SearchService {
	public List<Toilet> getToiletPoiInfo(String slocation, String elocation);
}
