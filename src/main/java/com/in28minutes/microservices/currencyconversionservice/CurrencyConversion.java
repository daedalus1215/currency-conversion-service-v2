package com.in28minutes.microservices.currencyconversionservice;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class CurrencyConversion {
    @Id
    private Long id;
    @Column(name="currency_from") // Need to give this a column name, since 'from' is a SQL keyword.
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal totalCalculationAmount;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyConversion(String from, String to, BigDecimal totalCalculationAmount, BigDecimal quantity, BigDecimal conversionMultiple, String environment) {
        this.from = from;
        this.to = to;
        this.totalCalculationAmount = totalCalculationAmount;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
    }
}
