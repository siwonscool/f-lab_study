package com.site.demo.domain.member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MemberRepository extends JpaRepository<Member,Long> {
    @Query("select m from Member m where m.id=:id and m.pw=:pw")
    Member findMember(String id, String pw);

}
