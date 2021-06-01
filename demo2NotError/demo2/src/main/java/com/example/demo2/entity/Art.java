package com.example.demo2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Art {

    @Id
    @GeneratedValue     //자동증가
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

    public Art(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public Art() {
    }
}
