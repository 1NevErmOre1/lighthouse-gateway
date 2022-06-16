package com.lighthouse.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gjk
 * <p> 2022-02-07 </p>
 * <p>  </p>
 */
@Configuration
public class GatewayConfiguration {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(route -> route
                        .path("/coupon-user/**")
                        .uri("lb://coupon-user-service"))
                .build();
    }
}
