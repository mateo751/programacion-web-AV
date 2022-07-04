package com.online.test.onlinetest.services.impl;

import com.online.test.onlinetest.dto.NewQuestionDTO;
import com.online.test.onlinetest.dto.QuestionDTO;
import com.online.test.onlinetest.repositories.QuestionRepository;
import com.online.test.onlinetest.services.QuestionService;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {
    final ModelMapper modelMapper;
    final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository repository, ModelMapper mapper){
        this.questionRepository = repository;
        this.modelMapper = mapper;
    }

    @Override
    public void create(NewQuestionDTO questionDTO) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<QuestionDTO> list() {
        // TODO Auto-generated method stub
        return null;
    }
}
