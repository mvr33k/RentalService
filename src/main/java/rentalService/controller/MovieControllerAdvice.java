package rentalService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.net.ConnectException;

@RestControllerAdvice
public class MovieControllerAdvice {

    @ExceptionHandler
    public ResponseEntity<String> handleHttpClientErrorException$NotFound(HttpClientErrorException.NotFound ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not found");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleHttpClientErrorException$BadRequest(HttpClientErrorException.BadRequest ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad request");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleHttpServerErrorException$InternalServerError(HttpServerErrorException.InternalServerError ex) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Bad gateway");
    }

    @ExceptionHandler
    public ResponseEntity<String> handleConnectException(ConnectException ex) {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("Gateway timeout");
    }

}

