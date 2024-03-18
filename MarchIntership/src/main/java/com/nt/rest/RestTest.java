package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTest {
@GetMapping("/test")
	public ResponseEntity<String> doTest(@RequestParam int a, @RequestParam  int  b) {
		int c=a+b;
	String 	result =""+ c;
	return new ResponseEntity<String>(result, HttpStatus.OK);
	}
	
	
}
