package com.rjhy.cloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@EnableRedisHttpSession  
public class HttpSessionConfig {
	
    @Bean  
    public JedisConnectionFactory connectionFactory() {  
    	return new JedisConnectionFactory();
    }
}