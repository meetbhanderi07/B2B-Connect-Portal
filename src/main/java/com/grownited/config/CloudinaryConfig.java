package com.grownited.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        Map<String, String> config = ObjectUtils.asMap(
            "cloud_name", "dahuheujm",
            "api_key", "277563155265865",
            "api_secret", "621F1DcvD6NUYSjjP3KIaJqoIlM"
        );
        return new Cloudinary(config);
    }
}


