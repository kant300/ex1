package com.example.ex1.Controller;

//controller에 클래스명은
//첫 글자대무자(작업이름)+Controller
//스프링부트는 클래스에 사용목적을 어노테이션으로 선언후 사용

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//http://localhost:8080
@Controller
public class StartController {
    //@Controller에 요청은 2가지
    //Get방식 : 주소로 요청하는 방식
    //Post방식 : Form으로 요청하는 방식

    //주소뒤에 / 로 요청이 들어오면
    @GetMapping("/list")
    public String index() {
        return "list"; //list.html로 응답한다.
    }
}
