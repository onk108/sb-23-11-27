package com.ll.sb231127.domain.member.member.repository;

import com.ll.sb231127.domain.member.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
