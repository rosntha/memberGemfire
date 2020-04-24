package com.web.example.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class MedicareDetail implements Serializable {

	private String effectiveDate;
	private String endDate;
	private String planBenefitPackageId;
	private String cmsContractNumber;
	private String memberThirdPartyElgSSNK;

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPlanBenefitPackageId() {
		return planBenefitPackageId;
	}

	public void setPlanBenefitPackageId(String planBenefitPackageId) {
		this.planBenefitPackageId = planBenefitPackageId;
	}

	public String getCmsContractNumber() {
		return cmsContractNumber;
	}

	public void setCmsContractNumber(String cmsContractNumber) {
		this.cmsContractNumber = cmsContractNumber;
	}

	public String getMemberThirdPartyElgSSNK() {
		return memberThirdPartyElgSSNK;
	}

	public void setMemberThirdPartyElgSSNK(String memberThirdPartyElgSSNK) {
		this.memberThirdPartyElgSSNK = memberThirdPartyElgSSNK;
	}
}
