package com.ioco.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.ioco.assessment.model.Invoice;
import com.ioco.assessment.repository.InvoiceRepository;


@Service
public class InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepository;

	public List<Invoice> getAllInvoices() {

		return (List<Invoice>) invoiceRepository.findAll();
	}

	public Invoice getInvoice(@PathVariable Long id) {
		
		return invoiceRepository.findById(id).get(); 
	}

	public List<Invoice> addInvoice(@RequestBody List<Invoice> invoices) {
		
		return invoiceRepository.saveAll(invoices);
	}
}
