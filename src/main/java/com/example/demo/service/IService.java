package com.example.demo.service;

import com.example.demo.model.DemoRequest;
import com.example.demo.model.DemoResponse;

public interface IService {
    DemoResponse demo(DemoRequest request);

}
