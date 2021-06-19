package com.cts.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private int port;
	private BigDecimal conversionMuliple;
	private BigDecimal quantity;
	private BigDecimal totalCalculatedAmount;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	/**
	 * @return the conversionMuliple
	 */
	public BigDecimal getConversionMuliple() {
		return conversionMuliple;
	}
	/**
	 * @param conversionMuliple the conversionMuliple to set
	 */
	public void setConversionMuliple(BigDecimal conversionMuliple) {
		this.conversionMuliple = conversionMuliple;
	}
	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalCalculatedAmount
	 */
	public BigDecimal getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	/**
	 * @param totalCalculatedAmount the totalCalculatedAmount to set
	 */
	public void setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	public CurrencyConversion() {
		super();
	}
	public CurrencyConversion(Long id, String from, String to, int port, BigDecimal conversionMuliple,
			BigDecimal quantity, BigDecimal totalCalculatedAmount) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.port = port;
		this.conversionMuliple = conversionMuliple;
		this.quantity = quantity;
		this.totalCalculatedAmount = totalCalculatedAmount;
	}
	
}
