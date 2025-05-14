package com.billing.usermaster;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigRouting {
	
	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder)
	{
		///api/itemmaster   //Master_Billing  //--http://localhost:9091
		return builder.routes()
				//------------------- item master
				.route("item",r -> r.path("/api/itemmaster/**").uri("lb://MASTER_BILLING"))
				///api/billing
				.route("billing",r -> r.path("/api/billing/**").uri("lb://MASTER_BILLING"))
				///api/hotelmaster
				.route("hotel",r -> r.path("/api/hotelmaster/**").uri("lb://MASTER_BILLING"))
				///api/ItemQuantity
				.route("quantity",r -> r.path("/api/ItemQuantity/**").uri("lb://MASTER_BILLING"))
				///api/itemRate
				.route("rate",r -> r.path("/api/itemRate/**").uri("lb://MASTER_BILLING"))

				//----------------user master --------------------
				//api/rolescreens
				.route("rolescreen",r -> r.path("/api/rolescreens/**").uri("http://localhost:9092"))
				///api/rolemaster
				.route("role",r -> r.path("/api/rolemaster/**").uri("http://localhost:9092"))
				///api/screenMaster
				.route("screen",r -> r.path("/api/screenMaster/**").uri("http://localhost:9092"))
				///api/usermaster
				.route("user",r -> r.path("/api/usermaster/**").uri("http://localhost:9092"))
                //.route("book-management-test",r -> r.path("/book-management/**").uri("lb://BOOK-MANAGEMENT"))
				.build();

	}

}
