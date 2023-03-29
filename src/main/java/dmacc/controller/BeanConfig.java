package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Cast;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Mar 21, 2023
 */
@Configuration
public class BeanConfig {
	
	@Bean
	Cast cast()
	{
		Cast cast = new Cast();
		return cast;
	}
}
