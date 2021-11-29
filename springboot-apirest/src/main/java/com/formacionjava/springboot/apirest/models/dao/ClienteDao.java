package com.formacionjava.springboot.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacionjava.springboot.apirest.models.entity.Cliente;
import com.formacionjava.springboot.apirest.models.entity.Region;

public interface ClienteDao extends CrudRepository<Cliente,Long>{

	@Query("from Region")
	public List<Region> findAllRegions();
}
