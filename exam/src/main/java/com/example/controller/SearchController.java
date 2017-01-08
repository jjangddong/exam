package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Toilet;
import com.example.service.SearchService;

@RestController
@RequestMapping(value="/poiSearch")
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value="/toilet", method=RequestMethod.GET)
	public ResponseEntity toiletSearch
		(@RequestParam(value="slocation") String slocation, @RequestParam(value="elocation") String elocation) {
		
		if("".equals(slocation) || "".equals(elocation)){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
		String[] sloc = slocation.split("\\|");
		String[] eloc = elocation.split("\\|");
		
		if(sloc.length < 2 || eloc.length < 2) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
		
		List<Toilet> toiletInfo = searchService.getToiletPoiInfo(sloc, eloc);
		
		return new ResponseEntity(toiletInfo, HttpStatus.OK);
	}
}