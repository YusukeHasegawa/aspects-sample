package com.example.aspectssample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class FooService {

    @Autowired
    private BarService barService;

    public String say() {
        return barService.say();
    }
}
