package com.aditya.MovieInfoService.resource;

import com.aditya.MovieInfoService.model.Movie;
import com.aditya.MovieInfoService.model.MovieDirectory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable String movieId){
        MovieDirectory movieDirectory = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey ,MovieDirectory.class);
        return new Movie(movieId,movieDirectory.getTitle(),movieDirectory.getOverview());
    }
}
