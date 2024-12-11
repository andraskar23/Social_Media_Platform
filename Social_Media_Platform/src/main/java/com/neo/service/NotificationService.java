package com.neo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.repo.NotificationRepo;

@Service
public class NotificationService {

	@Autowired
	private NotificationRepo notificationRepo;
	
	public String getMaxNotificationByUser(){
		
		Integer count = notificationRepo.getMaxNotificationByUser();
		
		return "Maximum no. of Notifications received by user  ";
	}
	
}
