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
	public Function<String, String> upperHello() {
		return (in) -> {
			return "Hello "+in.toUpperCase();
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(JavaFuncApplication.class, args);
	}

}
