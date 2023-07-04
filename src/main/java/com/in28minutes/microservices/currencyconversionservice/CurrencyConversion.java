package com.in28minutes.microservices.currencyconversionservice;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
public class CurrencyConversion implements Serializable {
    private Long id;
    private String from;
    private String to;
    private BigDecimal totalCalculationAmount;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyConversion(Long id, String from, String to, BigDecimal totalCalculationAmount, BigDecimal quantity, BigDecimal conversionMultiple, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.totalCalculationAmount = totalCalculationAmount;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
    }
}
