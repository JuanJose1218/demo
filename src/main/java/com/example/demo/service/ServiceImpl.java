package com.example.demo.service;

import com.example.demo.model.DemoRequest;
import com.example.demo.model.DemoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements IService {
    @Autowired
    Converter converter;

    @Override
    public DemoResponse demo(DemoRequest request) {
        return converter.apply(request);
    }
}
