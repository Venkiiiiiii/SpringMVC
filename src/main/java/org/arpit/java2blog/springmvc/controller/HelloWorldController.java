
package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;  

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld/{country}/{zip}")
	public ModelAndView hello(@PathVariable("country") String cn, @PathVariable("zip") String un) {
		ModelAndView modelAndView = null;
		String helloWorldMessage = "Hello world from ";
		String sName = "Venkiiiii";
		System.out.println("hiiiiiiiiiiiiii");
		modelAndView = new ModelAndView("hello", "message", helloWorldMessage);
		modelAndView.addObject("Name", sName);
		modelAndView.addObject("Details", "Country : " + cn + " <=======>   :  " + un);

		return modelAndView;
	}
}


