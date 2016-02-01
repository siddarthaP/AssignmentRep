package com.springlogin.classes;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	@RequestMapping(value="userCheck" ,method=RequestMethod.POST)
	
	public String userCheck(ModelMap model,HttpServletRequest request){
		
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		if("siddartha".equalsIgnoreCase(name)&& "siddartha".equalsIgnoreCase(password)){
			
			model.addAttribute("message","Successfully Logged in");
			
		}
		else{
			model.addAttribute("message","UserName or Password is Wrong");
		}

		
	return "success";
	}
	
}
