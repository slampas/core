package com.mycompany.dvdstore.core;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CoreApplication.class, args);
		// pas de sccaner sur la ligne de commande vscode (à voir ...)
		Movie movie = new Movie("le requin bleu","un film pour enfants");
		MovieService movieService =  new MovieService();
		movieService.registerMovie(movie);
		System.out.println(movie);
	}

}
