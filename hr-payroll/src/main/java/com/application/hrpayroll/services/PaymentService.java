package com.application.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.application.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayments(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
