package com.online.test.onlinetest.controllers;

import com.online.test.onlinetest.dto.ExamDTO;
import com.online.test.onlinetest.dto.NewExamDTO;
import com.online.test.onlinetest.services.ExamService;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exams")
public class ExamController {
    private final ExamService services;
    public ExamController(ExamService srv){
        this.services =srv;
    }


    @PostMapping()
    public ResponseEntity<?> create(@RequestBody NewExamDTO examDTO){
      try {
          ExamDTO result = services.create(examDTO);
          return ResponseEntity.status(HttpStatus.CREATED).body(result);
      } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
      }  
    }
}