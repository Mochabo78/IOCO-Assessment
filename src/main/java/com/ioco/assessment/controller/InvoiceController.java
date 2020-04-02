package com.ioco.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ioco.assessment.model.Invoice;
import com.ioco.assessment.service.InvoiceService;


@RestController
@RequestMapping("/invoices")
public class InvoiceController {
	
	@Autowired
	private InvoiceService invoiceService;
	
	@GetMapping("/invoices")
	public List<Invoice> getAllInvoices(){
		
		return invoiceService.getAllInvoices();
	}
	
	@GetMapping("/invoices/{id}")
	public Invoice getInvoice(@PathVariable Long id) {
		return invoiceService.getInvoice(id);
	}
	
	@PostMapping("/invoices")
	public List<Invoice> addInvoices(@RequestBody List<Invoice> invoices) {

		return invoiceService.addInvoice(invoices);
	}
}
