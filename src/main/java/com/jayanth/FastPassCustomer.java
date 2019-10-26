package com.jayanth;

import java.math.BigDecimal;

public class FastPassCustomer {
	private String fastPassId;
	private String customerFullName;
	private String fastPassPhone;
	@Override
	public String toString() {
		return "FastPassCustomer [fastPassId=" + fastPassId + ", customerFullName=" + customerFullName
				+ ", fastPassPhone=" + fastPassPhone + ", currentBalance=" + currentBalance + "]";
	}

	private BigDecimal currentBalance;
	
	public FastPassCustomer() {}

	public FastPassCustomer(String fastPassId, String customerFullName, String fastPassPhone,
			BigDecimal currentBalance) {
		super();
		this.fastPassId = fastPassId;
		this.customerFullName = customerFullName;
		this.fastPassPhone = fastPassPhone;
		this.currentBalance = currentBalance;
	}

	public String getFastPassId() {
		return fastPassId;
	}

	public void setFastPassId(String fastPassId) {
		this.fastPassId = fastPassId;
	}

	public String getCustomerFullName() {
		return customerFullName;
	}

	public void setCustomerFullName(String customerFullName) {
		this.customerFullName = customerFullName;
	}

	public String getFastPassPhone() {
		return fastPassPhone;
	}

	public void setFastPassPhone(String fastPassPhone) {
		this.fastPassPhone = fastPassPhone;
	}

	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	
	
}