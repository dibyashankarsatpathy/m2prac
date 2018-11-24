package com.cg.gt.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.gt.dto.Client;



@Repository
@Transactional
public class QueryDAOImpl implements IQuery{

	@PersistenceContext
	EntityManager entitymanager;
	
	
	@Override
	public Client searchId(int id) {
		Client cl=entitymanager.find(Client.class, id);
		return cl;
	}

	@Override
	public void updateClient(Client client) {
		entitymanager.merge(client);
		entitymanager.flush();
	}

}
