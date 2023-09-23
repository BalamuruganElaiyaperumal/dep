package com.file;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class File {
	@GetMapping(value="/get")
	public String get() {
		return "Welcome Kaai Kamal";
	}


}
