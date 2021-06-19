package com.cts.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private Long id;
	
	@Column(name = "currency_from")
	private String from;
	
	@Column(name = "currency_to")
	private String to;
	
	@Column(name = "conversion_mutiple")
	private BigDecimal conversionMuliple;
	private int port;
	

	

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMuliple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMuliple = conversionMuliple;
	}

	public ExchangeValue() {
	}

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

}
