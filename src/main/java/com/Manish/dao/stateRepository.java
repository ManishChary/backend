package com.Manish.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.Manish.entity.State;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(path="states")
public interface stateRepository extends JpaRepository<State, Integer> {
	List<State> findByCountryCode(@Param("code") String code);
	
	//localhost://8080/api/states/search/findByCountryCode?code=IN
}
