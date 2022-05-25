package com.online.test.onlinetest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor

public class ExamDTO {
    private Long id;
    private String title;
    private String description;
    private short timeLimit;
    private double minimumPassingScore;
    private short numberOfQuestions;
    private String instructions;      
}