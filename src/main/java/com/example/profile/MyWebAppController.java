package com.example.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebAppController {
	
	@GetMapping(value="/hi")
	public String print() {
		return "ATR GEM";
	}

}
