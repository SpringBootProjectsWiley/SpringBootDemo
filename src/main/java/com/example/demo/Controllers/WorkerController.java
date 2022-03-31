package com.example.demo.Controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Worker;

@RestController
public class WorkerController {
	
	@GetMapping("/worker/showWorker")
	public Worker showWorker() {
		return new Worker(1, "Rohit", "Naikade", 5000, new Date(), "Comp","rohit@gmail.com");
	}
	
	@GetMapping("/worker/all/showWorkers")
	public List<Worker> showWorkers() {
		return Arrays.asList(
				new Worker(1, "Rohit", "Naikade", 5000, new Date(), "Comp","rohit@gmail.com"),
				new Worker(2, "Shambhu", "Mohite", 3000, new Date(), "Comp","shambhu@gmail.com"),
				new Worker(3, "Vijay", "Dabhade", 50000, new Date(), "Comp","vijay@gmail.com"));
	}
}
