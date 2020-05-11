package com.alexoterof.movieadvisor.service;

import java.util.Collection;

import com.alexoterof.movieadvisor.model.Film;


public interface FilmQueryService {
	//Patron Builder
	
	public Collection<Film> exec();
	
	public FilmQueryService anyGenre(String... genres);
	
	public FilmQueryService allGenres(String... genres);
	
	public FilmQueryService year(String year);
	
	public FilmQueryService betweenYears(String from, String to);
	
	public FilmQueryService titleContains(String title);
}
