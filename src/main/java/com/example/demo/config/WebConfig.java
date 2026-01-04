package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {

        // v1
        configurer.addPathPrefix(
            "/api/v1",
            c -> c.getPackageName().contains(".controller.api.v1")
        );

        // v2
        configurer.addPathPrefix(
            "/api/v2",
            c -> c.getPackageName().contains(".controller.api.v2")
        );

        // v3
        configurer.addPathPrefix(
            "/api/v3",
            c -> c.getPackageName().contains(".controller.api.v3")
        );
    }
}
