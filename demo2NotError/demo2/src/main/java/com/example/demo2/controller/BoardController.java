package com.example.demo2.controller;

import com.example.demo2.DTO.BoardDTO;
import com.example.demo2.Repository.ArtRepository;
import com.example.demo2.entity.Art;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
@Autowired//1modify
    private ArtRepository artRepository;

    @RequestMapping("/board/form")
    public String call_form(){
        return "board/form";
    }

    @RequestMapping("board/out")
    public String call_table(BoardDTO boardDTO, Model model)
    {
        String title = boardDTO.getTitle();
        String content = boardDTO.getContent();
        model.addAttribute("title", title);
        model.addAttribute("content", content);

        //1. Object -> Entity 변환
        Art art = boardDTO.toEntity();
            //toEntity : 객체를 개체화 시킨다.
            //1) Art Class 정의
            //2) BoardDTO안에 toEntity() 정의

        //2. 개체들을 DB에 저장(repository)
        Art saved = artRepository.save(art);
            //1) ArtRepository 인터페이스 생정


        return "board/out";
    }










}
