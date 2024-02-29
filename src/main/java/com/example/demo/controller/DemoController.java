package com.example.demo.controller;

import com.example.demo.model.DemoRequest;
import com.example.demo.service.IService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {
    @Autowired
    IService service;
    @PostMapping(value = "/demo")
    public ResponseEntity<Object> evaluateScore(@Valid @RequestBody DemoRequest request) {
        return new ResponseEntity<>(service.demo(request), HttpStatus.OK);
    }
}
