package com.learning.microservices.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Component
@NoArgsConstructor
@ConfigurationProperties("limits-service")
public class Configuration {

	private int maximum;
	private int minimum;
}
