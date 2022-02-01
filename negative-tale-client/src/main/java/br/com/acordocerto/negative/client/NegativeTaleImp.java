package br.com.acordocerto.negative.client;

import br.com.acordocerto.negative.domain.CustomerNegativeDebtResponse;
import feign.Feign;
import feign.Logger;
import feign.Request;
import feign.Retryer;
import feign.jackson.JacksonDecoder;

public class NegativeTaleImp implements NegativeTaleApi{

    public static final String API_URL_DEFAULT = "http://localhost:8080/api";

    private final String apiUrl;

    public NegativeTaleImp(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    private NegativeTaleApi buildApi(){
        return Feign.builder()
                .decoder(new JacksonDecoder())
                .options(new Request.Options())
                .retryer(Retryer.NEVER_RETRY)
                .logger(new Logger.JavaLogger(NegativeTaleApi.class))
                .logLevel(Logger.Level.FULL)
                .target(NegativeTaleApi.class, apiUrl);
    }

    @Override
    public CustomerNegativeDebtResponse findNegativeDebt(String customerIdHash) {
        return buildApi().findNegativeDebt(customerIdHash);
    }
}
