package bra.edu.ifsp.artinstudies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bra.edu.ifsp.artinstudies.repository.LivroRepository;

@SpringBootApplication
@RestController
public class ArtinstudiesApplication {

	@GetMapping("/teste")
	String home(){
		return "Hello World!";
	}
	public static void main(String[] args) {
		LivroRepository.init();
		SpringApplication.run(ArtinstudiesApplication.class, args);
	}

}
