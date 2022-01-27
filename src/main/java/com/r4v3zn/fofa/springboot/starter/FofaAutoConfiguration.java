/*
 * Copyright (c) 2019. r4v3zn.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.r4v3zn.fofa.springboot.starter;

import com.r4v3zn.fofa.core.client.FofaClient;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Title: FofaAutoConfiguration
 * Desc: Fofa Auto Configuration
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
     * Create FofaClient Bea
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