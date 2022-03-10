package com.duranco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PremierController {
@GetMapping("")
public ModelAndView firstPage()
{
ModelAndView mv=new ModelAndView("page.html");	
return mv;
}
@PostMapping("calcule")
public String secondeView( @RequestParam int a)
{
	Premier p=new Premier(a);
	return p.premier();

}


}
