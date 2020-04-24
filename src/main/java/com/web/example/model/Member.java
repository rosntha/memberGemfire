package com.web.example.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.gemfire.mapping.annotation.Region;

@Region(value = "Member")
public class Member {

	@Id
	private String id;

	private String subscriberKey;
	/*
	 * private String person; private Integer memberNumber; private String
	 * subscriberSequenceNumber; private String bluestarAccountNumber; private
	 * String partyId; private String subscriberPartyId; private
	 * List<MedicareDetail> medicareDetail; private Long mid; private String
	 * subscriberIndicator; private Integer permanentMemberNumber; private String
	 * vipReasonCode; private Date lastUpdateTS; private String
	 * clientMemberIdentifier; private List<MemberSubscriberIdentifier>
	 * memberSubscriberIdentifier; private String clientKey; private String
	 * lineOfBusiness; private String relationshipCode; private String
	 * eligibilityCode; private Date gemfireLastUpdateTS; private String
	 * sourceSystemName; private String contextSourceKey; private Date
	 * sourceQueryTimestamp;
	 * 
	 * public String getMemberKey() { return id; }
	 * 
	 * public void setMemberKey(String memberKey) { this.id = memberKey; }
	 * 
	 * public String getSubscriberKey() { return subscriberKey; }
	 * 
	 * public void setSubscriberKey(String subscriberKey) { this.subscriberKey =
	 * subscriberKey; }
	 * 
	 * public String getPerson() { return person; }
	 * 
	 * public void setPerson(String person) { this.person = person; }
	 * 
	 * public Integer getMemberNumber() { return memberNumber; }
	 * 
	 * public void setMemberNumber(Integer memberNumber) { this.memberNumber =
	 * memberNumber; }
	 * 
	 * public String getSubscriberSequenceNumber() { return
	 * subscriberSequenceNumber; }
	 * 
	 * public void setSubscriberSequenceNumber(String subscriberSequenceNumber) {
	 * this.subscriberSequenceNumber = subscriberSequenceNumber; }
	 * 
	 * public String getBluestarAccountNumber() { return bluestarAccountNumber; }
	 * 
	 * public void setBluestarAccountNumber(String bluestarAccountNumber) {
	 * this.bluestarAccountNumber = bluestarAccountNumber; }
	 * 
	 * public String getPartyId() { return partyId; }
	 * 
	 * public void setPartyId(String partyId) { this.partyId = partyId; }
	 * 
	 * public String getSubscriberPartyId() { return subscriberPartyId; }
	 * 
	 * public void setSubscriberPartyId(String subscriberPartyId) {
	 * this.subscriberPartyId = subscriberPartyId; }
	 * 
	 * public List<MedicareDetail> getMedicareDetails() { return medicareDetail; }
	 * 
	 * public void setMedicareDetails(List<MedicareDetail> medicareDetail) {
	 * this.medicareDetail = medicareDetail; }
	 * 
	 * public Long getMid() { return mid; }
	 * 
	 * public void setMid(Long mid) { this.mid = mid; }
	 * 
	 * public String getSubscriberIndicator() { return subscriberIndicator; }
	 * 
	 * public void setSubscriberIndicator(String subscriberIndicator) {
	 * this.subscriberIndicator = subscriberIndicator; }
	 * 
	 * public Integer getPermanentMemberNumber() { return permanentMemberNumber; }
	 * 
	 * public void setPermanentMemberNumber(Integer permanentMemberNumber) {
	 * this.permanentMemberNumber = permanentMemberNumber; }
	 * 
	 * public String getVipReasonCode() { return vipReasonCode; }
	 * 
	 * public void setVipReasonCode(String vipReasonCode) { this.vipReasonCode =
	 * vipReasonCode; }
	 * 
	 * public Date getLastUpdateTS() { return lastUpdateTS; }
	 * 
	 * public void setLastUpdateTS(Date lastUpdateTS) { this.lastUpdateTS =
	 * lastUpdateTS; }
	 * 
	 * public String getClientMemberIdentifier() { return clientMemberIdentifier; }
	 * 
	 * public void setClientMemberIdentifier(String clientMemberIdentifier) {
	 * this.clientMemberIdentifier = clientMemberIdentifier; }
	 * 
	 * public List<MemberSubscriberIdentifier> getMemberSubscriberIdentifier() {
	 * return memberSubscriberIdentifier; }
	 * 
	 * public void setMemberSubscriberIdentifier(List<MemberSubscriberIdentifier>
	 * memberSubscriberIdentifier) { this.memberSubscriberIdentifier =
	 * memberSubscriberIdentifier; }
	 * 
	 * public String getClientKey() { return clientKey; }
	 * 
	 * public void setClientKey(String clientKey) { this.clientKey = clientKey; }
	 * 
	 * public String getLineOfBusiness() { return lineOfBusiness; }
	 * 
	 * public void setLineOfBusiness(String lineOfBusiness) { this.lineOfBusiness =
	 * lineOfBusiness; }
	 * 
	 * public String getRelationshipCode() { return relationshipCode; }
	 * 
	 * public void setRelationshipCode(String relationshipCode) {
	 * this.relationshipCode = relationshipCode; }
	 * 
	 * public String getEligibilityCode() { return eligibilityCode; }
	 * 
	 * public void setEligibilityCode(String eligibilityCode) { this.eligibilityCode
	 * = eligibilityCode; }
	 * 
	 * public Date getGemfireLastUpdateTS() { return gemfireLastUpdateTS; }
	 * 
	 * public void setGemfireLastUpdateTS(Date gemfireLastUpdateTS) {
	 * this.gemfireLastUpdateTS = gemfireLastUpdateTS; }
	 * 
	 * public String getSourceSystemName() { return sourceSystemName; }
	 * 
	 * public void setSourceSystemName(String sourceSystemName) {
	 * this.sourceSystemName = sourceSystemName; }
	 * 
	 * public String getContextSourceKey() { return contextSourceKey; }
	 * 
	 * public void setContextSourceKey(String contextSourceKey) {
	 * this.contextSourceKey = contextSourceKey; }
	 * 
	 * public Date getSourceQueryTimestamp() { return sourceQueryTimestamp; }
	 * 
	 * public void setSourceQueryTimestamp(Date sourceQueryTimestamp) {
	 * this.sourceQueryTimestamp = sourceQueryTimestamp; }
	 */

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubscriberKey() {
		return subscriberKey;
	}

	public void setSubscriberKey(String subscriberKey) {
		this.subscriberKey = subscriberKey;
	}
}
