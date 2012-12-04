package com.App;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean {

	private Integer userNumber;

	private Integer min = 0;
	private Integer max = 100;

	private Integer winningNumber = 25;
	private Integer count;

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer countMe() {
		count++;
		return count;

	}

	public String checkGuess() {
		if (userNumber == winningNumber) {
			return "success";
		} else if (userNumber > winningNumber) {
			return "tooBig";
		} else if (userNumber < winningNumber)
			return "tooSmall";
		return null;
	}

	public Integer getMin() {
		return min;
	}

	public void setMin(Integer min) {
		this.min = min;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public Integer getWinningNumber() {
		return winningNumber;
	}

	public void setWinningNumber(Integer winningNumber) {
		this.winningNumber = winningNumber;
	}
}