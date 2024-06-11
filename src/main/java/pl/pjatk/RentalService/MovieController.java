package pl.pjatk.RentalService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

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

    @PatchMapping("/available/{id}")
    public void returnMoviesAvailable(
            @PathVariable Integer id){
//        return ResponseEntity.ok(movieService.returnMovie(id));
        movieService.returnMovie(id);
    }

}
