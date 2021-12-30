package com.tui.enjoy.enjoyableLibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EnjoyableLibraryApplication {

	public static void main(final String[] args) {
		SpringApplication.run(EnjoyableLibraryApplication.class, args);
	}

}
