package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebaController {
	
	@RequestMapping(path="/")
	public String prueba4(){
		return "/prueba.html";
	}

	@RequestMapping(path="/hola")
	@ResponseBody
	public String prueba5(){
		return "I <3 spring";
	}

}
