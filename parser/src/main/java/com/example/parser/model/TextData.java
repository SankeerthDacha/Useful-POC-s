package com.example.parser.model;

public class TextData {
	private String Country_Code;
	private String  Zipcodefrom;
	private String ZipcodeTo; 
	private String Destination;
	private String State;
	public String getCountry_Code() {
		return Country_Code;
	}
	public TextData(){
		
	}
	public void setCountry_Code(String country_Code) {
		Country_Code = country_Code;
	}
	public String getZipcodefrom() {
		return Zipcodefrom;
	}
	public void setZipcodefrom(String zipcodefrom) {
		Zipcodefrom = zipcodefrom;
	}
	public String getZipcodeTo() {
		return ZipcodeTo;
	}
	public void setZipcodeTo(String zipcodeTo) {
		ZipcodeTo = zipcodeTo;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public TextData(String country_Code, String zipcodefrom, String zipcodeTo, String destination, String state) {
		super();
		Country_Code = country_Code;
		Zipcodefrom = zipcodefrom;
		ZipcodeTo = zipcodeTo;
		Destination = destination;
		State = state;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextData other = (TextData) obj;
		if (Country_Code == null) {
			if (other.Country_Code != null)
				return false;
		} else if (!Country_Code.equals(other.Country_Code))
			return false;
		if (Destination == null) {
			if (other.Destination != null)
				return false;
		} else if (!Destination.equals(other.Destination))
			return false;
		if (State == null) {
			if (other.State != null)
				return false;
		} else if (!State.equals(other.State))
			return false;
		if (ZipcodeTo == null) {
			if (other.ZipcodeTo != null)
				return false;
		} else if (!ZipcodeTo.equals(other.ZipcodeTo))
			return false;
		if (Zipcodefrom == null) {
			if (other.Zipcodefrom != null)
				return false;
		} else if (!Zipcodefrom.equals(other.Zipcodefrom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TxtD [Country_Code=" + Country_Code + ", Zipcodefrom=" + Zipcodefrom + ", ZipcodeTo=" + ZipcodeTo
				+ ", Destination=" + Destination + ", State=" + State + "]";
	}
}
