package com.example.javautilslibrary.domain.repository;

import com.example.javautilslibrary.domain.object.entity.Member;
import com.example.javautilslibrary.infrastructure.entity.mybatis.MemberEntity;

import java.util.List;

/**
 * Member Repository
 */
public interface MemberRepository {

    Member save(MemberEntity member);

    Member fetchById(Long memberId);

    List<Member> fetchAll(Integer count);

    Member fetchByAccountName(String accountName);

    Boolean deleteById(Long memberId);

    Member updateMember(MemberEntity member);
}
