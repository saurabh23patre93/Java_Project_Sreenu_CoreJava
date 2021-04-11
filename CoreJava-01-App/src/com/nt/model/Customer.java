package com.nt.model;

public class Customer {
	private String custId;
	private String name;
	private String mobileNo;
	private String carNum;
	private String cvv;
	private String expDate;
	private String balence;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getBalence() {
		return balence;
	}
	public void setBalence(String balence) {
		this.balence = balence;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", mobileNo=" + mobileNo + ", carNum=" + carNum
				+ ", cvv=" + cvv + ", expDate=" + expDate + ", balence=" + balence + "]";
	}
	
	
}
