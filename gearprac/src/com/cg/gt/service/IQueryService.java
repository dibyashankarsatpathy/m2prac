package com.cg.gt.service;

import com.cg.gt.dto.Client;

public interface IQueryService {
	
	public Client searchId(int id);
	public void updateClient(Client client);

}
