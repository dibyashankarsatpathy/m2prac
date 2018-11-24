package com.cg.gt.dao;

import com.cg.gt.dto.Client;

public interface IQuery {
	public Client searchId(int id);
	public void updateClient(Client client);

}
