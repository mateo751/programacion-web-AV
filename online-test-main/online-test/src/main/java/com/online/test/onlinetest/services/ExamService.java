package com.online.test.onlinetest.services;

import java.util.List;

import com.online.test.onlinetest.dto.ExamDTO;
import com.online.test.onlinetest.dto.NewExamDTO;

public interface ExamService {

    public ExamDTO create(NewExamDTO examDTO);
    public ExamDTO retrieve(Long id);
    public ExamDTO update(ExamDTO examDTO);
    public void delete(Long id);

    public List<ExamDTO> list();
    
}
