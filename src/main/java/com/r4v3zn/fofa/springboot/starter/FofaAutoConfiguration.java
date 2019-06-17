package com.r4v3zn.fofa.springboot.starter;

import com.r4v3zn.fofa.core.client.FofaClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: FofaAutoConfiguration
 * Descrption: TODO
 * Date:2019-06-14 12:12
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@Configuration
@EnableConfigurationProperties(FofaProperties.class)
public class FofaAutoConfiguration {

    /**
     * Create FofaClient Bean
     * @param  fofaProperties fofa properties
     * @return FofaClient
     */
    @Bean
    public FofaClient fofaClientService(FofaProperties fofaProperties){
        String email = fofaProperties.getEmail();
        String key = fofaProperties.getKey();
        FofaClient client = new FofaClient(email, key);
        return client;
    }

}