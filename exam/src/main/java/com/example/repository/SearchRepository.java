package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.domain.Toilet;

public interface SearchRepository extends JpaRepository<Toilet, Long> {
	
	@Query("select t from Toilet t where t.longitude >= :sx and t.longitude <= :ex and t.latitude >= :sy and t.latitude <= :ey")
	List<Toilet> findToiletByLongitudeAndLatitude
		(@Param("sx") double sx, @Param("ex") double ex, @Param("sy") double sy, @Param("ey") double ey);
}
