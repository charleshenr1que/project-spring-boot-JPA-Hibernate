package com.charlesproject.projectSpring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.charlesproject.projectSpring.entities.User;
import com.charlesproject.projectSpring.repositories.UserRepository;

@Configuration
@Profile("test") // Inicializando o perfil de test do spring boot
public class TestConfig implements CommandLineRunner{
	//CommandLineRun : Implementa um metodo para executar qualquer codigo
	//quando iniciar 
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		//userRepository.saveAll(Arrays.asList(u1,u2));
		userRepository.save(u1);
		userRepository.save(u2);
		
	}
	
	
	

}
