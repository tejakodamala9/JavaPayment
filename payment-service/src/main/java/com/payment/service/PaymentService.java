package com.payment.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.dao.PaymentRepository;
import com.payment.entity.Payment;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	
	public String paymentProcessing() {
		//API should be 3rd party payment gateway (paypal,paytm...)
		return new Random().nextBoolean()?"success":"failure";
	}
	
}
