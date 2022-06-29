package com.start.app.MyApp.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {

			Student nikita = new Student("Nikita", "hell.lol.world@gmail.com", LocalDate.of(2001, Month.DECEMBER, 20));
			Student egor = new Student("Egor", "egor@gmail.com", LocalDate.of(1999, Month.NOVEMBER, 13));
			Student pavel = new Student("Pavel", "pavel@gmail.com", LocalDate.of(1995, Month.AUGUST, 3));

			studentRepository.saveAll(List.of(nikita, egor, pavel));
		};
	}
}
