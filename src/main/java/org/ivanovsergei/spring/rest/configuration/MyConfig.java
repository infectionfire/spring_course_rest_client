package org.ivanovsergei.spring.rest.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("org.ivanovsergei.spring.rest")
public class MyConfig {

        @Bean//для http request
        public RestTemplate restTemplate(){
            return new RestTemplate();
        }

}
