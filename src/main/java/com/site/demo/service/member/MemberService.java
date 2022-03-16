package com.site.demo.service.member;

import com.site.demo.domain.member.Member;
import com.site.demo.web.dto.LoginResponseDto;

public interface MemberService {
    public LoginResponseDto LoginByIdPw(String id, String pw);
    public void JoinMember(Member member);
}
