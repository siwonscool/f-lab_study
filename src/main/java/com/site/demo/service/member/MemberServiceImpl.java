package com.site.demo.service.member;


import com.site.demo.domain.member.Member;
import com.site.demo.domain.member.MemberRepository;
import com.site.demo.web.dto.LoginResponseDto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @Override
    public LoginResponseDto LoginByIdPw(String id, String pw){
        Member entity = memberRepository.findMember(id,pw);
        return new LoginResponseDto(entity);
    }

    @Override
    public void JoinMember(Member member) {

    }
}
