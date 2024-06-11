package rentalService.service;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import rentalService.model.Movie;

@Service
public class MovieService {

    public MovieService() {
    }



    public Movie getMovie(Integer id){

        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("http://localhost:8080/movies/"
                + id, Movie.class);
    }

    public void returnMovie(Integer id){
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.put("http://localhost:8080/movies/available/"
                + id, Movie.class);
    }

    public void lendMovie(Integer id){
        RestTemplate restTemplate=new RestTemplate();
        restTemplate.put("http://localhost:8080/movies/notavailable/"
                + id, Movie.class);
    }
}
