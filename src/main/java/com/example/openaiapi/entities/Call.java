package com.example.openaiapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter @AllArgsConstructor@NoArgsConstructor
public class Call {
    private String model;
    private String prompt;
    private Integer max_tokens;
    private Double temperature;


}
