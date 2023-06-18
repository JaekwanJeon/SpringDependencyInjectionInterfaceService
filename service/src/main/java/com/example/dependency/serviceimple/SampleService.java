package com.example.dependency.serviceimple;

import com.example.dependency.ISampleService;

class SampleService implements ISampleService {
    @Override
    public String getName() {
        return "James";
    }
}
