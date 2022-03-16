package com.site.demo.web.controller;

import com.site.demo.service.member.MemberService;
import com.site.demo.web.dto.LoginResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class LoginApiController {
    private final MemberService memberService;

    @PostMapping("login")
    public LoginResponseDto login(@RequestParam String id, @RequestParam String pw){
        return memberService.LoginByIdPw(id, pw);
    }
}
