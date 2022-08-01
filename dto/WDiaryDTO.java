package com.project.care.dto;

import lombok.Data;

@Data
public class WDiaryDTO {


//산책 일기 테이블
private String wseq;
private String datetime;
private String place;
private String pic;
private String title;
private String content;
private String id;


//반려동물 관련 변수
private String seq; //산책일기 반려동물 번호
private String useq; 
private String aseq; 


//반려동물 테이블
private String name; //반려동물 이름
private String gender; //반려동물 성별
private String age; //반려동물 나이
private String kseq; //품종번호
private String birth; //생일
private String dogpic; //반려동물 사진
private String dogweight; //반려동물 몸무게


//품종
private String tseq ;//타입번호
private String kind; //품종


public String getWseq() {
	return wseq;
}
public void setWseq(String wseq) {
	this.wseq = wseq;
}
public String getDatetime() {
	return datetime;
}
public void setDatetime(String datetime) {
	this.datetime = datetime;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
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
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSeq() {
	return seq;
}
public void setSeq(String seq) {
	this.seq = seq;
}
public String getUseq() {
	return useq;
}
public void setUseq(String useq) {
	this.useq = useq;
}
public String getAseq() {
	return aseq;
}
public void setAseq(String aseq) {
	this.aseq = aseq;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getKseq() {
	return kseq;
}
public void setKseq(String kseq) {
	this.kseq = kseq;
}
public String getBirth() {
	return birth;
}
public void setBirth(String birth) {
	this.birth = birth;
}
public String getDogpic() {
	return dogpic;
}
public void setDogpic(String dogpic) {
	this.dogpic = dogpic;
}
public String getDogweight() {
	return dogweight;
}
public void setDogweight(String dogweight) {
	this.dogweight = dogweight;
}
public String getTseq() {
	return tseq;
}
public void setTseq(String tseq) {
	this.tseq = tseq;
}
public String getKind() {
	return kind;
}
public void setKind(String kind) {
	this.kind = kind;
}


	
}
