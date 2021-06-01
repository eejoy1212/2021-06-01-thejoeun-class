package com.example.demo2.DTO;

import com.example.demo2.entity.Art;
import org.springframework.data.repository.CrudRepository;

public class BoardDTO {
    private String title;
    private String content;

    public BoardDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public BoardDTO() {
    }

    public Art toEntity() {

        long id=0;//2 modify
        return new Art(id, title, content);

    }
}
