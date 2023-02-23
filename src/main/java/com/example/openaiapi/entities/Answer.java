package com.example.openaiapi.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@Getter @AllArgsConstructor@NoArgsConstructor
public class Answer {

    String id;
    String object;
    LocalDate created;
    String model;

    List<Choice> choices;
    Usage usage;
}
