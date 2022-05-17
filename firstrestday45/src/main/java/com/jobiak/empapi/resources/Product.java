package com.jobiak.empapi.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/catalog")
public class Product 
{
	@GetMapping("/mobile")
	public String showCatalog()
	{
		return new String("Samsung E@FH,Dual Camera,32 GB Memory,49999,I got you");
	}
	
	@GetMapping("/intro")
	public String introduction()
	{
		return new String("I am srujana");
	}
	
	@GetMapping("/search/{modelId}")
	public String searchModel(@PathVariable(value="modelId")String modelId)
	{
		return new String(modelId+"Is availabel in Blue and Black color");
	}
}
