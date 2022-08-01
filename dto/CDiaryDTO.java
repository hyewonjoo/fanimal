package com.project.care.dto;

import java.sql.Date;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class CDiaryDTO {
	
	private String cdSeq;
	private String title;
	private String content;
	private String datetune; 
	private String id;
	private String pSeq;
	private String aSeq;
	private String picture;
	
	// 동물 정보
	private String animalName;
	private String animalPic;
	private String age; 
	
	// 의료정보
	private String pname; // 제품명
	private String component; // 성분명
	private String pDate; //투약일수
	private String usage; //용법
	private String amount; //용량
	
	private String purpose; //진단or수술or접종 
	private String explain;
	
	private String surgery;
	private String vaccination;
	
	private String resdate;//예약날짜==처방전발급날짜
	
	
	public String getCdSeq() {
		return cdSeq;
	}

	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDatetune() {
		return datetune;
	}

	public void setDatetune(String datetune) {
		this.datetune = datetune;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getpSeq() {
		return pSeq;
	}

	public void setpSeq(String pSeq) {
		this.pSeq = pSeq;
	}

	public String getaSeq() {
		return aSeq;
	}

	public void setaSeq(String aSeq) {
		this.aSeq = aSeq;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalPic() {
		return animalPic;
	}

	public void setAnimalPic(String animalPic) {
		this.animalPic = animalPic;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getSurgery() {
		return surgery;
	}

	public void setSurgery(String surgery) {
		this.surgery = surgery;
	}

	public String getVaccination() {
		return vaccination;
	}

	public void setVaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	public String getResdate() {
		return resdate;
	}

	public void setResdate(String resdate) {
		this.resdate = resdate;
	}


	
}
