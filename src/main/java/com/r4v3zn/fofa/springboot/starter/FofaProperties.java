package com.r4v3zn.fofa.springboot.starter;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Title: FofaProperties
 * Descrption: TODO
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