package org.foobarspam.cotxox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CotxoxController {

	@RequestMapping(path="/")
	public String index() {
		return "/index.html";
	}
}
