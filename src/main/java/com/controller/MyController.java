package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="/a", method=RequestMethod.POST)
	public ResponseEntity<?> getname(@RequestParam("id") int id,@RequestParam("name") String name ){
		return new ResponseEntity<>("Done"+ id + name, HttpStatus.OK);
	}
}
