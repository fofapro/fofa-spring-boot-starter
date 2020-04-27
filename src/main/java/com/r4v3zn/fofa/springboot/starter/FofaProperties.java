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


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Title: FofaProperties
 * Desc: Fofa Properties
 * Date:2019-06-14 11:49
 * Email:woo0nise@gmail.com
 * Company:www.j2ee.app
 *
 * @author R4v3zn
 * @version 1.0.0
 */
@ConfigurationProperties(prefix = FofaProperties.PROP_PREFIX)
public class FofaProperties {

    public static final String PROP_PREFIX  = "fofa";

    private String email;

    private String key;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public String getKey() {
        return key;
    }
}