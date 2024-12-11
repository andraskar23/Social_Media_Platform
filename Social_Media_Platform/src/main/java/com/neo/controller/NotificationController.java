package com.neo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController  {

	
	@Autowired
	public ResponseEntity<?> getMaxNotificationByUser(){
		
		return new ResponseEntity<>("",HttpStatus.OK);
	}
	
}
