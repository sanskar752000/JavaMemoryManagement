package com.BookCatalog;

import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}

	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			Double result = value;
			return result;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			Double result = conversion * value;
			return result;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	public Map<String,Double> getRates() {
		Map<String, Double> rateVar = rates;
		return rateVar;
	}
	
}
