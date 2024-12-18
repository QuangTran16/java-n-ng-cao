package com.example.cinema_back_end.security.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("http://example.com");  // Cho phép domain này
        corsConfiguration.addAllowedMethod("*");  // Cho phép tất cả các phương thức HTTP
        corsConfiguration.addAllowedHeader("*");  // Cho phép tất cả các header
        corsConfiguration.setAllowCredentials(true);  // Cho phép gửi cookie

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);  // Áp dụng cho tất cả các endpoint

        return new CorsFilter(source);
    }
}
