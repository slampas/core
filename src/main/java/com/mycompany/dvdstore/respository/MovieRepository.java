package com.mycompany.dvdstore.respository;

import java.util.ArrayList;
import java.util.List;

import com.mycompany.dvdstore.entity.Movie;

public class MovieRepository {

    public void addMovie(Movie movie) {
        private List<Movie> movies = new ArrayList<Movie>();
        movies.add(movie);
        System.out.println("The movie "+movie.getTitre() +" has been added.");

    }

}
