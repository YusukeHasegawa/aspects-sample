package com.example.aspectssample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
@SpringBootTest
public class ServiceTest {

    @Autowired
    BarService barService;

    @Test
    void test() {
        assertThat(barService.say()).isEqualTo("bar");

        FooService fooService = new FooService();
        assertThat(fooService.say()).isEqualTo("bar");

        assertThat(BarService.hoo()).isEqualTo("hoo");
        assertThat(fooService.getFoo()).isEqualTo("fooooooooo");
    }

}
