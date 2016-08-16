package com.masry.demo.webclient;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LedgerEventsReceiver {


	
	

	private final static Logger logger = LoggerFactory.getLogger(LedgerEventsReceiver.class);

	
	@RabbitListener(queues = "reportQueue")
	public String receiveAccount(String message) {

		System.err.println(message);
		
		return message.toUpperCase();
	}

}