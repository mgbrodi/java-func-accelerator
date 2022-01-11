package com.example.javafunc;

import java.util.Properties;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.net.URI;

@SpringBootApplication
public class JavaFuncApplication {
    @Value("${rapidapi.host}")
    static String host;
    @Value("${rapidapi.key}")
    static String key;

	@Bean
	public Function<String, String> getStock() {
		return (in) -> {

			HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://live-stock-market.p.rapidapi.com/yahoo-finance/v1/chart?symbol="+in+"&interval=1d&range=1mo"))
		.header("x-rapidapi-host", host)
		.header("x-rapidapi-key", key)
		.method("GET", HttpRequest.BodyPublishers.noBody())
		.build();
		try {
			HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
			return response.body();
		} catch (Exception e) {
			return "Error: "+e.getMessage();
		}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaFuncApplication.class, args);
	}

}
