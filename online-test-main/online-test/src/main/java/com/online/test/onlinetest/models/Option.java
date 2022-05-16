package com.online.test.onlinetest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_OPTIONS")
@Getter
@Setter

public class Option{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="TITLE",nullable = false )
    private String title;

    @Column(name ="DESCRIPTION" )
    private String description;

    @Column(name ="TIME_LIMIT" )
    private int timeLimit;
}
