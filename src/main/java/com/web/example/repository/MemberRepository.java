
package com.web.example.repository;

import org.springframework.data.gemfire.repository.query.annotation.Trace;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.example.model.Member;

@Repository
//public interface MemberRepository extends GemfireRepository<Member, String> {
public interface MemberRepository extends CrudRepository<Member, String> {

	// @Trace
	// Member findByTitle(String title);

	@Trace
	Member findMemberDetailsById(String mid);

}
