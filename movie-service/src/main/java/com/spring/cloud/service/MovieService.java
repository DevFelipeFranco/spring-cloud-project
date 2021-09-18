package com.spring.cloud.service;

import com.spring.cloud.model.Movie;

import java.util.List;

public interface MovieService {

    Movie save(Movie movie);
    void delete(Movie movie);
    List<Movie> findAll();
    Movie findById(Long id);
}
