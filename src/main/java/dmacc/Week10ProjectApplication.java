package dmacc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dmacc.repository.CastRepo;

@SpringBootApplication
public class Week10ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week10ProjectApplication.class, args);
	}
	
	@Autowired
	CastRepo repo;

}
