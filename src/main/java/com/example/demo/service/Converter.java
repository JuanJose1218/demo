package com.example.demo.service;

import com.example.demo.model.DemoRequest;
import com.example.demo.model.DemoResponse;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Converter implements Function<DemoRequest, DemoResponse> {
    @Override
    public DemoResponse apply(DemoRequest request) {
        var demo = new DemoResponse("MOAS800313");
        demo.setNombre(request.getNombre());
        demo.setApellido(request.getApellido());
        return demo;
    }
}
