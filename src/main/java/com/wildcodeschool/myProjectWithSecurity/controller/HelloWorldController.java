package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    public String hello() {
        return "Hello World !!!";
    }

    @GetMapping("/avangers/assemble")
    public String avangers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String bases() {
        return "Bordeaux La Loupe Lille Lyon Marseille Nantes Orléans Paris Reims Strasbourg Toulouse Tours Europe Amsterdam Barcelone Berlin Bruxelles Bucarest Lisbonne Londres Madrid";
    }
}
