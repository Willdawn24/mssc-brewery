package com.willfeng.msscbrewery.service;

import com.willfeng.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId){
        System.out.println("creating beer with uuid: "+beerId);
        return BeerDto.builder().id(UUID.randomUUID()).beerName("Galaxy Cat").beerStyle("pale ale").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID uuid, BeerDto beerDto) {

    }
}
