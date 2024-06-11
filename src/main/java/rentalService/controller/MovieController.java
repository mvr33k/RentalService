package rentalService.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import rentalService.model.Movie;
import rentalService.service.MovieService;

@RestController
@RequestMapping("/rental")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Integer id) {
        return ResponseEntity.ok(movieService.getMovie(id));
    }

    @PutMapping("/available/{id}")
    public void returnMoviesAvailable(
            @PathVariable Integer id){
//        ResponseEntity.ok(movieService.returnMovie(id));
        movieService.returnMovie(id);
    }

    @PutMapping("/notavailable/{id}")
    public void returnMoviesNotAvailable(
            @PathVariable Integer id){
//        ResponseEntity.ok(movieService.returnMovie(id));
        movieService.lendMovie(id);
    }

}
