package com.kood.dev.springboot2demo.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IndexControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_랜딩() {
        //when
        String body = this.restTemplate.getForObject("/", String.class);

        //then
        assertTrue(body.contains("스프링 부트"));
    }
}
