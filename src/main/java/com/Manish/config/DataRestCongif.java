package com.Manish.config;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class DataRestCongif implements RepositoryRestConfigurer
{
	private EntityManager entityManager;

	public DataRestCongif(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
	exposeId(config);
	}

	private void exposeId(RepositoryRestConfiguration config) {
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		List<Class> entityClasses = new ArrayList<>();
		for(EntityType entity:entities) {
			entityClasses.add(entity.getJavaType());
		}
		
		Class[] domainType = entityClasses.toArray(new Class[0]);
		config.exposeIdsFor(domainType);
	}
	
	
}
