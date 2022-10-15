package guru.springframework.msscbeerservice.controller;


import guru.springframework.msscbeerservice.model.BeerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
@Component
public class BeerController {

    @GetMapping("/{beerId}")
    private ResponseEntity<BeerDTO> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo impl....
        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDTO beerDTO){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }
    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDTO beerDTO){
        //todo impl..
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
