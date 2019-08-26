package com.willfeng.msscbrewery.service;

import com.willfeng.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
    BeerDto saveNewBeer(BeerDto beerDto);
    void updateBeer(UUID uuid, BeerDto beerDto);
}
