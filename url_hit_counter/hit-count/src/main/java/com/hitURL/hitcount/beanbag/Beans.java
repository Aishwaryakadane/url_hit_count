package com.hitURL.hitcount.beanbag;

import com.hitURL.hitcount.Enitity.Varibles;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beans {

    @Bean
    public List<Varibles> geturllist(){
        return new ArrayList<>();
    }
}
