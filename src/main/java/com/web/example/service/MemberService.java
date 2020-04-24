package com.web.example.service;

import com.web.example.model.Member;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {

	public String addMemberDetails(Member member);

	public Member findMemberById(String id);

	public void updateMemberById(Member member);

	public void deleteMemberById(String id);

	public List<Member> getALLMembers();

}
