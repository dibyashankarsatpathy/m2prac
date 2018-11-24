package com.cg.gt.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gt.dao.IQuery;
import com.cg.gt.dto.Client;
@Service
@Transactional
public class QueryServiceImpl implements IQueryService{
	@Autowired
	IQuery querydao;
	@Override
	public Client searchId(int id) {
		// TODO Auto-generated method stub
		return querydao.searchId(id);
	}

	@Override
	public void updateClient(Client client) {
		// TODO Auto-generated method stub
		querydao.updateClient(client);
	}

}
