package com.ioco.assessment.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.sound.sampled.Line;

@Entity
public class Invoice implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String client;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long Id;

  private Date invoiceDate;

  private Long vatRate;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "invoices")
  private Set<Line> line = new HashSet<Line>(0);

  /* Getters and setters */

  public String getClient() {
    return client;
  }

  public Long getId() {
    return Id;
  }

  public Date getInvoiceDate() {
    return invoiceDate;
  }

  public Long getVatRate() {
    return vatRate;
  }

  public void setClient(String client) {
    this.client = client;
  }

  public void setId(Long id) {
    Id = id;
  }

  public void setInvoiceDate(Date invoiceDate) {
    this.invoiceDate = invoiceDate;
  }

  public void setVatRate(Long vatRate) {
    this.vatRate = vatRate;
  }

}
