package com.online.test.onlinetest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor

public class NewQuestionDTO {
    private String name;
    private String description;
    private short score;
    private ExamDTO exam;
}
