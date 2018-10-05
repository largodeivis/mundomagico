package com.mundomagico.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	
	@RequestMapping(value= {"/welcome", "/"}, method= RequestMethod.GET) //doesn't support POST 
	public String welcome(ModelMap model) {									// need anothe rmethod to support POST
		model.addAttribute("welcomeMenuItem", "active");
		return "welcome";
	}
	
	//Play around function
//	@RequestMapping(value="/welcome", method= RequestMethod.POST) //support POST
//	public String aboutus(@RequestParam String name, ModelMap model) {			
//		model.put("name", name);
//		return "aboutus"; //takes to the About Us page
//	}
//	
	@RequestMapping(value="/aboutus", method= RequestMethod.GET) //support POST
	public String aboutUs(ModelMap model) {		
		model.addAttribute("aboutUsMenuItem", "active");
		//model.put("name", name);
		return "aboutUs"; //takes to the About Us page
	}



}
