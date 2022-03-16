package com.site.demo.web.dto;

import com.site.demo.domain.member.Member;
import lombok.Getter;

@Getter
public class LoginResponseDto {
    private String id;
    private String pw;
    private String name;

    public LoginResponseDto(Member entity) {
        this.id = entity.getId();
        this.pw = entity.getPw();
        this.name = entity.getName();
    }
}
