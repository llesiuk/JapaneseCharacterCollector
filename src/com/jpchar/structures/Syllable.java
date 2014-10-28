package com.jpchar.structures;

public class Syllable {

	private String name;
	private String txtNumber;
	private int number;
	private int numberOfStrokes;
	
	public Syllable(String name, int number, int numberOfStrokes) {
		this.name = name;
		this.number = number;
		if(number < 10) {
			this.txtNumber = "0" + number;
		} else {
			this.txtNumber = "" + number;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTxtNumber() {
		return txtNumber;
	}

	public void setTxtNumber(String txtNumber) {
		this.txtNumber = txtNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumberOfStrokes() {
		return numberOfStrokes;
	}

	public void setNumberOfStrokes(int numberOfStrokes) {
		this.numberOfStrokes = numberOfStrokes;
	}
	
	public String getCode() {
		return this.txtNumber + "_" + this.name;
	}
	
	public String getKanjiCode() {
		if (this.number < 10) {
			return "k000" + this.number;
		} else 
		if (this.number < 100) {
			return "k00" + this.number;
		} else
		if (this.number < 1000) {
			return "k0" + this.number;
		} else {
			return "k" + this.number;
		}
	}
	
	
}
