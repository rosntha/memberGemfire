package com.web.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.example.model.Member;
import com.web.example.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepository memberRepository;

	public String addMemberDetails(Member member) {

		memberRepository.save(member);

		return "saved Successfully";
	}

	@Override
	public Member findMemberById(String id) {

		Member member = memberRepository.findMemberDetailsById(id);

		return member;
	}

	@Override
	public void updateMemberById(Member member) {
		

	}

	@Override
	public void deleteMemberById(String id) {
		
		//Member memberDetails = memberRepository.findMemberDetailsById(member.getMemberKey());

		//memberRepository.delete(memberDetails);
	}

	@Override
	public List<Member> getALLMembers() {
		
		 Iterable<Member> findAll = memberRepository.findAll();
		 
		 List<Member> m = new ArrayList<Member>();

		 findAll.forEach( obj -> m.add(obj));
				 
				 return m;
				 
	}
}
