package com.example.demo.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@GetMapping("/task")
	public String task() {
		return "Task demonstration";
	}
	
	@GetMapping("/task/showMyInfo")
	public String showMyInfo() {
		
		String str="'"
				+ "Name:Rohit Anand Naikade."
				+ "City:Rajgurunagar,Maharashtra"
				+ "Dream Job:SDE Role in a top investment Bank"
				+ "'";
		return str;
	}
	
	@GetMapping("/task/showMyHobbies")
	public List<String> showMyHobbies() {
		return List.of("Playing Cricket","Poetry","Trekking");
	}
}
