package com.payment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payment.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
