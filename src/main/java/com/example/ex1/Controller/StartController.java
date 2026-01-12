package com.example.ex1.Controller;

//controller에 클래스명은
//첫 글자대무자(작업이름)+Controller
//스프링부트는 클래스에 사용목적을 어노테이션으로 선언후 사용

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//브라우저를 통해서 페이지를 호출할때
//http://localhost:8080
@Controller
public class StartController {
    //@Controller에 요청은 2가지
    //Get방식 : 주소로 요청하는 방식
    //Post방식 : Form으로 요청하는 방식

    //주소뒤에 / 로 요청이 들어오면
    /*
    목록보기
     */
    @GetMapping("/list")
    public String index() {
        return "list"; //list.html로 응답한다.
    }
    /*
    등록폼 이동
     */
    @GetMapping("/insert")//요청주소, 맵핑값
    public String insert() {//메소드명은 맵핑이름과 비슷
        return "register";//요청이 들어오면 register.html로 응답한다.

    }
    /*
    수정폼 이동
     */
    @GetMapping("/modify")
    public String modify() {
        return "modify";
    }
}
