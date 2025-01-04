package com.azure.azureapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AzureController {
	@GetMapping("/name")
	public String name() {
		return "hi deepak v2";
	}

}
