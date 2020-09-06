package com.example.mail.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class MailConfig {

    @Bean
    public SimpleMailMessage message(@Value("${spring.mail.username}") String sender) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sender);

        return message;
    }
}
