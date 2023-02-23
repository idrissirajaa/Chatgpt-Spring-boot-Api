package com.example.openaiapi.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter@NoArgsConstructor
public class Choice {

    private String text;
    private Integer index;
    private Integer logprobs;
    private String finish_reason;

}
