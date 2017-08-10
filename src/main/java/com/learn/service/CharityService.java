package com.learn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class CharityService {

	/**
	 * @return a list of categories of help that can be offered
	 */
	public List<String> getAvailableCategories(){
		List<String> cateories = new ArrayList<String>();
		cateories.add("books");
		cateories.add("clothes");
		return cateories;
	}
	
	/**
	 * @return a list of names of all people who can help
	 */
	public List<String> getHelpers(){
		List<String> helpers = new ArrayList<String>();
		helpers.add("Sheena");
		helpers.add("Sheena1");
		helpers.add("Sheena2");
		helpers.add("Sheena3");
		return helpers;
		
	}
	
	/**
	 * POST: Offer help for a particular category
	 */
	@RequestMapping("/offerHelp")
	public void offerHelp(){
		
	}
	
	/**
	 * Return all helpers
	 */
	@RequestMapping("/fetchHelpers")
	public void fetchHelpers(){
		
	}
	
}
