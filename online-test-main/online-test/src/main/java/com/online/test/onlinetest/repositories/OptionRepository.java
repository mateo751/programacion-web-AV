package com.online.test.onlinetest.repositories;

import com.online.test.onlinetest.models.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
    
}