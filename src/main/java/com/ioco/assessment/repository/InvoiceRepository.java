package com.ioco.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ioco.assessment.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
