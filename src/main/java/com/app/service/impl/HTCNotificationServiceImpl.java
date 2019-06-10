package com.app.service.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;


@Component
@Profile("htc")
public class HTCNotificationServiceImpl implements INotificationService {

	@Override
	public void notificate() {
		// TODO Auto-generated method stub
		System.out.println("Only For HTC Profile.");
		
	}

}
