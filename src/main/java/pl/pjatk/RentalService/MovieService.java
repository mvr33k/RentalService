package pl.pjatk.RentalService;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
        restTemplate.exchange("http://localhost:8080/movies/available/"
                + id, HttpMethod.PATCH, new HttpEntity<>(null), Movie.class);
    }
}
