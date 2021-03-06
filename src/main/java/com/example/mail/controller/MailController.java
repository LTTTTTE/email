package com.example.mail.controller;

import com.example.mail.service.MailService;
import com.example.mail.service.dto.MailRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {

    private final MailService mailService;

    @PostMapping("/mail")
    public ResponseEntity<Void> sendMail(@RequestBody MailRequestDto mailRequestDto) {
        mailService.sendMail(mailRequestDto);

        return ResponseEntity.accepted().build();
    }
}
