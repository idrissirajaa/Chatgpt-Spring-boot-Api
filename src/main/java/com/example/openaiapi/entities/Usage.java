package com.example.openaiapi.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Usage {
    Integer prompt_token;
    Integer completion_tokens;
    Integer total_tokens;

    }
