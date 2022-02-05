package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.Repository.repoClass;
import com.project.entity.entityClass;

@Controller
public class controller {

	@Autowired
	private repoClass repo;
	
	
	@RequestMapping("/api/list-enabled-features/{vid}")
	public String fetch(@PathVariable int  vid) {
		
		String str="";
		entityClass entity = repo.findById(vid).orElse(new entityClass());
		System.out.println(entity);
	
		
		return str;
		
	}
	
	
}
