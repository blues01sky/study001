package com.example.demo.main.bean;

public class Money {
	private double money;
	private String type;
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Money [money=" + money + ", type=" + type + "]";
	}
	
}
