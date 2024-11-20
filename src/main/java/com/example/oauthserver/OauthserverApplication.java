package com.example.oauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.oauthserver.authorization.RsaProperties;

@EnableConfigurationProperties(RsaProperties.class)
@SpringBootApplication
public class OauthserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthserverApplication.class, args);
	}

}
