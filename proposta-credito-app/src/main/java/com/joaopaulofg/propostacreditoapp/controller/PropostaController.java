package com.joaopaulofg.propostacreditoapp.controller;

import com.joaopaulofg.propostacreditoapp.dto.PropostaRequestDto;
import com.joaopaulofg.propostacreditoapp.dto.PropostaResponseDto;
import com.joaopaulofg.propostacreditoapp.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proposta")
@AllArgsConstructor
public class PropostaController {

    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto propostaRequestDto) {
        return new  ResponseEntity<>(propostaService.criar(propostaRequestDto), HttpStatus.CREATED);
    }
}
