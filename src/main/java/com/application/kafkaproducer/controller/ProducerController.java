package com.application.kafkaproducer.controller;

import com.application.kafkaproducer.service.interfaces.ProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/send/")
public class ProducerController {

    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestParam String message){
        producerService.sendMessage(message);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
