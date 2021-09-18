package com.spring.cloud.controller;

import com.spring.cloud.model.Movie;
import com.spring.cloud.service.MovieService;
import com.spring.cloud.utils.Response;
import com.spring.cloud.utils.ResponseBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;
    private final ResponseBuilder builder;

    @GetMapping
    public ResponseEntity<List<Movie>> findAllMovie() {
        return ResponseEntity.ok(movieService.findAll());
    }
}
