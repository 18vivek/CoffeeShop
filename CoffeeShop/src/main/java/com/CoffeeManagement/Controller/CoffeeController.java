package com.CoffeeManagement.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CoffeeController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	   public String index() {
	      return "index";
	   }

}
