package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.respository.MovieRepository;

public class MovieService {
    private MovieRepository movieRepository= new MovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.addMovie(movie);
    }
    
}
