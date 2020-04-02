package com.ioco.assessment.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "line_item") // your table name
public class LineItem implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  private String description;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long Id;

  private Long quantity;

  private BigDecimal unitPrice;
  
  @ManyToOne
  @JoinColumn(name = "id", nullable = false) // Invoice id
  private Invoice invoice;

  /* Getters and setters */

  public String getDescription() {
    return description;
  }

  public Long getId() {
    return Id;
  }

  public Long getQuantity() {
    return quantity;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setId(Long id) {
    Id = id;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }

}
