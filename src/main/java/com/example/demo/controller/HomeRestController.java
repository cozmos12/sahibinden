package com.example.demo.controller;

import com.example.demo.entitiy.Home;
import com.example.demo.service.HomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/controller")
public class HomeRestController {

    private final HomeService homeService;


    public HomeRestController(HomeService homeService) {
        this.homeService = homeService;
    }


    @PostMapping("/findAll")
    public List<Home> getFindAll(@RequestParam Optional<String> eşya, @RequestParam Optional<String> odasayısı, @RequestParam Optional<String> doğalgaz, @RequestParam Optional<Integer> binayaşı, @RequestParam Optional<String> satılıkkiralık, @RequestParam Optional<Integer> fiyat , @RequestParam Optional<String> il, @RequestParam Optional<String> ilçe){
        return homeService.findAll(eşya,odasayısı,doğalgaz,binayaşı,satılıkkiralık,fiyat,il,ilçe);
    }

    @PostMapping("/findAlllis")
    public List<Home> finAllHome(){

        System.out.printf("");
        System.out.printf("");
        System.out.printf("");
        System.out.printf("");


        return homeService.homelist();


    }

}
