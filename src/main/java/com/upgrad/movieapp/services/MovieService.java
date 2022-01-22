package com.upgrad.movieapp.services;

import com.upgrad.movieapp.entities.Movie;

public interface MovieService {

	public Movie acceptMovie(Movie movie);
	public Movie getMovieDetails(int id);
	public Movie updateMovieDetails(int id,Movie movie);
	public boolean deleteMovie(int id);
	
}
