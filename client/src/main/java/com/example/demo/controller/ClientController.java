package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Client;
import com.example.demo.repository.cilentRepository;

@RestController
public class ClientController {
    @Autowired
    cilentRepository clientRepository ;
    @GetMapping("/clients")
    public List chercherClients(){
        return clientRepository.findAll();
    }
    @GetMapping("/client/{id}")
    public Client chercherUnClients (@PathVariable Long id) throws Exception{

        return this.clientRepository.findById(id).orElseThrow(()-> new Exception("Client inexistnt"));
    }}
