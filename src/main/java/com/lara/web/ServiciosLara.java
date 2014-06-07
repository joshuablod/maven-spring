package com.lara.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosLara {
    @Bean
    Persona ejecutarGracia(){
        return new CuentaChistes();
    }
}
