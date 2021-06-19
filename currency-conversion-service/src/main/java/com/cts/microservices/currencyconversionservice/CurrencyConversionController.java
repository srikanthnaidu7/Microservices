package com.cts.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	
	//This method is used for without feign to add more code
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCurrencyConversion(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {
		
		//Feign Problem -1 
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
				CurrencyConversion.class, uriVariables); 
		CurrencyConversion response = responseEntity.getBody();
		
		return new CurrencyConversion(response.getId(), from, to, response.getPort(),
				response.getConversionMuliple(), quantity, quantity.multiply(response.getConversionMuliple()));
	}
	
	
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getCurrencyConversionFeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {
		
		CurrencyConversion response = proxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversion(response.getId(), from, to, response.getPort(),
				response.getConversionMuliple(), quantity, quantity.multiply(response.getConversionMuliple()));
	}
}
