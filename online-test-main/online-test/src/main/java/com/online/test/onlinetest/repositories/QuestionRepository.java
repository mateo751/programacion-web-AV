package com.online.test.onlinetest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.test.onlinetest.models.Question;

@Repository
public interface  QuestionRepository extends JpaRepository<Question,Long> {
    public List<Question> findByNombreAut(String name);
}