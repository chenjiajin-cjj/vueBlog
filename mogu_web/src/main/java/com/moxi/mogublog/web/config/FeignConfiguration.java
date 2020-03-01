package com.moxi.mogublog.web.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class FeignConfiguration {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password123");
    }

    public static void main(String[] args) throws Exception{

        List<String> phone = new ArrayList<>();
        phone.add("11");
        phone.add("22");
        phone.add("33");

        Random random = new Random();
        while (true){

            String t = phone.get(random.nextInt(phone.size()));
            System.out.println(t);
            Thread.sleep(1000);
        }
    }

}
