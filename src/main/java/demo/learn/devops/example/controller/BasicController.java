package demo.learn.devops.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	@GetMapping(value = "/test")  
	public String getBasicText()   
	{  	
	//returns the text
	return "Hello World";  
	}  
}
