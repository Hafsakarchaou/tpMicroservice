package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Voiture;
import com.example.demo.repository.VoitureRepository;

@RestController
public class VoitureController {
    @Autowired
    VoitureRepository voitureRepository ;
    @GetMapping("/voitures")
    public List chercherVoitures(){
        return voitureRepository.findAll();
    }
    @GetMapping("/voiture/{id}")
    public Voiture chercherVoiture (@PathVariable Long id) throws Exception{

        return this.voitureRepository.findById(id).orElseThrow(()-> new Exception("Voiture inexistnte"));}}

