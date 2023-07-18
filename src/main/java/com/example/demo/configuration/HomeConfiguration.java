package com.example.demo.configuration;

import com.example.demo.entitiy.Home;
import com.example.demo.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.*;
@Service
public class HomeConfiguration {


    private  HomeRepository homeRepository;
    @Autowired
    public HomeConfiguration(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }


    public List<Home> mapToHome(Map<String, Object> homeMap) {
        String esya = (String) homeMap.getOrDefault("eşya", null);
        String odaSayisi = (String) homeMap.getOrDefault("odaSayısı", null);
        String isitmaTuru = (String) homeMap.getOrDefault("ısıtmaTürü", null);
        Integer binaYasi = (Integer) homeMap.getOrDefault("binaYaşı", null);
        String satilikKiralik = (String) homeMap.getOrDefault("satılıkKiralık", null);
        Integer fiyat = (Integer) homeMap.getOrDefault("fiyat", null);
        String il = (String) homeMap.getOrDefault("il", null);
        String ilce = (String) homeMap.getOrDefault("ilçe", null);

        return homeRepository.findByParams(esya, odaSayisi, isitmaTuru, binaYasi, satilikKiralik, fiyat, il, ilce);
    }




}
