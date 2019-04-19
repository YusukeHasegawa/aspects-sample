package com.example.aspectssample;

import org.springframework.stereotype.Service;

@Service
public class BarService {
    public String say() {
        return "bar";
    }

    public static String hoo() {
        return "hoo";
    }
}
