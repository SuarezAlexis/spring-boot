/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexissuarez.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Alexis
 */
@RestController
public class MainController {
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring-Boot";
    }
}
