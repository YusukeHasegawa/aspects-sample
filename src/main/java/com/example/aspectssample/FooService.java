package com.example.aspectssample;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.util.StringUtils;

@Configurable
public class FooService {

    @Getter
    private String foo = "fooooooooo";

    @Autowired
    private BarService barService;

    public String say() {
        return barService.say();
    }

    public String quote(String s) {
        return StringUtils.quote(s);
    }
}
