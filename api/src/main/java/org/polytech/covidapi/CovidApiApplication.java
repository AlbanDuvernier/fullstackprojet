package org.polytech.covidapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class CovidApiApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CovidApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub


		String sql = "INSERT INTO patient (id, first_name, last_name, mail, phone_number, address, vaccinated) VALUES ('0','toto', 'tata', 'titi','1234567', 'ici' , true)";
		int rows = jdbcTemplate.update(sql);
		if (rows > 0){
			System.out.println("une colone a été ajouté");
			
		}

		sql = "INSERT INTO admin (id, first_name, last_name, mail, phone_number, address) VALUES ('0','admin', 'admin', 'admin','1234567', 'ici' )";
		rows = jdbcTemplate.update(sql);
		if (rows > 0){
			System.out.println("une colone a été ajouté");
			
		}

		sql = "INSERT INTO admin (id, first_name, last_name, mail, phone_number, address) VALUES ('1','admin1', 'admin1', 'admin1','1234567', 'ici' )";
		rows = jdbcTemplate.update(sql);
		if (rows > 0){
			System.out.println("une colone a été ajouté");
			
		}

		sql = "INSERT INTO super_admin (id, first_name, last_name, mail, phone_number, address) VALUES ('0','supadmin', 'supadmin', 'supadmin','1234567', 'ici' )";
		rows = jdbcTemplate.update(sql);
		if (rows > 0){
			System.out.println("une colone a été ajouté");
		}
	
	}



}
