package com.sa.estore.apigateway.estore_spring_api_gateway.ApiGateWayConfiguration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.util.RouteMatcher;

public class ApiGatewayConfiguration {


    //https://lalverma.medium.com/spring-boot-microservices-api-gateway-e9dbcd4bb754
//    @Bean
//    public RouteLocator gatewayRouter(RouteLocatorBuilder builder){
//
//    return builder.routes()
//            .route("path_route", r -> r.path("/product").and().method("POST", "PUT", "DELETE").and().host("vendor.test-gateway-store.com")
//                    .uri("http://localhost:8081"))
//            .route("path_route", r -> r.path("/product/**").and().method("GET")
//                    .uri("http://localhost:8082"))
//            .build();
//}
//
//
//    }


}
