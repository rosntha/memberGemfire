package com.web.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.example.service.MemberService;
import com.web.example.model.Member;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "memberservice", description = "the Member Service API")
public class MemberController {

	@Autowired
	MemberService memberService;

	@ApiOperation(value = "add Member Details", nickname = "addMember", response = String.class)

			@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 204, message = "Member Not Found"),
			@ApiResponse(code = 415, message = "Request Validation Error"),
			@ApiResponse(code = 500, message = "Internal Server Failure#Unsuccessful response description"),
			@ApiResponse(code = 503, message = "Service Unavailable#Unsuccessful response description") })

	@RequestMapping(value = "/addmember", method = RequestMethod.POST)
	public String addMember(@RequestBody Member member) {

		memberService.addMemberDetails(member);

		return "saved successfully";

	}

	@ApiOperation(value = "get Member Details", nickname = "getMember", response = String.class)

			@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 204, message = "Member Not Found"),
			@ApiResponse(code = 415, message = "Request Validation Error"),
			@ApiResponse(code = 500, message = "Internal Server Failure#Unsuccessful response description"),
			@ApiResponse(code = 503, message = "Service Unavailable#Unsuccessful response description") })

	@RequestMapping(value = "/getMember", method = RequestMethod.GET)
	public Member findMember(@RequestParam(value = "id") String id) {

		Member memberDetails = memberService.findMemberById(id);

		return memberDetails;

	}

	@ApiOperation(value = "delete Member Details", nickname = "deleteMember", response = String.class)

			@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 204, message = "Member Not Found"),
			@ApiResponse(code = 415, message = "Request Validation Error"),
			@ApiResponse(code = 500, message = "Internal Server Failure#Unsuccessful response description"),
			@ApiResponse(code = 503, message = "Service Unavailable#Unsuccessful response description") })
	
	@RequestMapping(value = "/deleteMember", method = RequestMethod.DELETE)
	public String deleteMember(@RequestParam(value = "id") String id) {

		memberService.deleteMemberById(id);

		return "deleted Member Successfully";

	}

	@ApiOperation(value = "update Member Details", nickname = "updateMember", response = String.class)

			@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 204, message = "Member Not Found"),
			@ApiResponse(code = 415, message = "Request Validation Error"),
			@ApiResponse(code = 500, message = "Internal Server Failure#Unsuccessful response description"),
			@ApiResponse(code = 503, message = "Service Unavailable#Unsuccessful response description") })

	@RequestMapping(value = "/updateMember", method = RequestMethod.PUT)
	public String updateMemberBYId(@RequestBody Member member) {

		memberService.updateMemberById(member);

		return "Upadted Member Successfully";

	}
	
	@ApiOperation(value = "Get All Member Details", nickname = "getAllMember", response = String.class)

			@ApiResponses(value = { @ApiResponse(code = 200, message = "successful operation"),
			@ApiResponse(code = 204, message = "Member Not Found"),
			@ApiResponse(code = 415, message = "Request Validation Error"),
			@ApiResponse(code = 500, message = "Internal Server Failure#Unsuccessful response description"),
			@ApiResponse(code = 503, message = "Service Unavailable#Unsuccessful response description") })

	
	@RequestMapping(value = "/getallMember", method = RequestMethod.GET)
	public List<Member> getAll() {

		List<Member> allMembers = memberService.getALLMembers();

		return allMembers;

	}
}
