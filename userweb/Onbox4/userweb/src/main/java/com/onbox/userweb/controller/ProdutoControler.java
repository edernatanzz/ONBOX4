package com.onbox.userweb.controller;


import academy.Onbox.springboot2.domain.Produto;
import academy.Onbox.springboot2.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController // classe cotroler do spring mvc
@RequestMapping("produto")
@Log4j2
@RequiredArgsConstructor
public class ProdutoControler {
private final DateUtil dateUtil ;

    //local host:8080/produto/list
    @GetMapping( path =  "list")
    public List<Produto>list (){
        log.info(dateUtil.formarLocalDateTimeToDatabaseStyle(LocalDateTime.now()));

        return List.of(new Produto ("Pastel 44444 "), new Produto ("teste "));
    }

}
