package com.cg.gt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.gt.dto.Client;
import com.cg.gt.service.IQueryService;

@Controller
public class QueryController {
	
	
	@Autowired
	IQueryService queryService;

	@RequestMapping(value="all")
	public String getAll()
	{
		return "search";
	}
	
	@RequestMapping(value="update")
	public ModelAndView updateClient(@ModelAttribute("uu") Client client ,Map<String,Object> model)
	{
		Client newclient= queryService.searchId(client.getQueryId());
		int id=client.getQueryId();
		if( newclient==null)
		{
			return new ModelAndView("failure","queId",id);
			
		}
		else
		{
			Client clientOne= queryService.searchId(client.getQueryId());
			clientOne.setQueryId(client.getQueryId());
			List<String> answeredBy=new ArrayList<String>();
			answeredBy.add("Uma");
			answeredBy.add("Rahul");
			answeredBy.add("Kavita");
			answeredBy.add("Hema");
			model.put("answered",answeredBy);
			return new ModelAndView("answer","temp", clientOne);
			
		}
	
	}
	
	@RequestMapping(value="updated")
	public ModelAndView updated(@ModelAttribute("uu") Client client){
		int id=client.getQueryId();
		queryService.updateClient(client);
		return new ModelAndView("answersuccess","queId",id);
		
		
		
		
	}
		
		
	
	
}
