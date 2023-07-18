package com.example.demo.service;

import com.example.demo.configuration.HomeConfiguration;
import com.example.demo.entitiy.Home;
import com.example.demo.repository.HomeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HomeService {

    private final HomeConfiguration homeConfiguration;
    private final HomeRepository homeRepository;

    public HomeService(HomeConfiguration homeConfiguration, HomeRepository homeRepository) {
        this.homeConfiguration = homeConfiguration;
        this.homeRepository = homeRepository;
    }



    public List<Home> findAll(Optional<String> eşya, Optional<String> OdaSayısı, Optional<String> ısıtmaTürü, Optional<Integer> binaYaşı, Optional<String> satılıkKiralık, Optional<Integer> fiyat, Optional<String> il, Optional<String> ilçe){
         Map<String, Object> paramMap = new HashMap<>();

        List<Optional<?>> optionalParams = List.of(eşya,OdaSayısı, ısıtmaTürü, binaYaşı, satılıkKiralık, fiyat, il, ilçe);
        List<String> paramNames = List.of("eşya", "odaSayısı", "ısıtmaTürü", "binaYaşı", "satılıkKiralık", "fiyat", "il", "ilçe");

        for (int i = 0; i < optionalParams.size(); i++) {
            Optional<?> optional = optionalParams.get(i);
            String paramName = paramNames.get(i);

            optional.ifPresent(value -> paramMap.put(paramName, value));
        }


        return  homeConfiguration.mapToHome(paramMap);

    }

    public List<Home> homelist(){
        return homeRepository.findAll();
    }



}
