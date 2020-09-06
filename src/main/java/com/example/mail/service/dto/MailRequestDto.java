package com.example.mail.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MailRequestDto {

    private String sendTo;
    private String title;
    private String content;
}
