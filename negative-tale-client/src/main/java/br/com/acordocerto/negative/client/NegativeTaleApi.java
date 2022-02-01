package br.com.acordocerto.negative.client;

import br.com.acordocerto.negative.domain.CustomerNegativeDebtResponse;

import feign.Headers;
import feign.Param;
import feign.RequestLine;

@Headers("Content-Type: application/json")
public interface NegativeTaleApi {
	
	@RequestLine("GET /api/v1/negative/{customerIdHash}")
	CustomerNegativeDebtResponse findNegativeDebt(@Param("customerIdHash") String customerIdHash);
	
}