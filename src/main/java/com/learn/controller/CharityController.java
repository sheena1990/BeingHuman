package com.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.service.CharityService;

@RestController
public class CharityController {
	
	@Autowired
	private CharityService charityService;
	/**
	 * @return a list of categories of help that can be offered
	 */
	@RequestMapping("/getAvailableCategories")
	public List<String> getAvailableCategories(){
		System.out.println("In method getAvailableCategories");
		return charityService.getAvailableCategories();
	}
	
/*	@RequestMapping("/error")
	public void errorMsg(){
		System.out.println("error");
	}*/
	
	/**
	 * @return a list of names of all people who can help
	 */
	@RequestMapping("/getHelp")
	public List<String> getHelp(){
		return charityService.getHelpers();
	}
	
	/**
	 * POST: Offer help for a particular category
	 * This variable name and parameter name should be same
	 */
	@RequestMapping("/offerHelp/{category}")
	public void offerHelp(@PathVariable String category){
		
	}
	
	/**
	 * Return all helpers
	 */
	@RequestMapping("/fetchHelpers")
	public void fetchHelpers(){
		
	}
	

	
	

}
