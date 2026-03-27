package com.desafio.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API REST de Clientes")
                        .description("Desafio Final - Bootcamp Arquiteto de Software. API RESTful com padrão MVC para gerenciamento de clientes.")
                        .version("1.0.0"));
    }
}