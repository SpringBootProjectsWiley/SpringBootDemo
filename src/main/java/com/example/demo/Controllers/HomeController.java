package com.example.demo.Controllers;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String message() {
		Long datetime = System.currentTimeMillis();
        Timestamp timestamp = new Timestamp(datetime);
		return "Hello Visitor! \n Visiting Time:"+timestamp;
	}
}
