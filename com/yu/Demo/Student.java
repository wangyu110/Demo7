package com.yu.Demo;

public class Student {
/**
 * 学生类
 * 属性：name,gender,math,chinese,english
 * 行为：info,total，avg
 */
	//属性
	private String name;
	private String gender; 
	private int math;
	private int chinese;
	private int english;
	//构造
	public Student(String name,String gender,int math,int chinese,int english){
		this.name=name;
		this.gender=gender;
		this.math=math;
		this.english=english;
		this.chinese=chinese;
		
	}
	//方法
	public String info(){
		String info="name:"+name+"\n"+
	                  "gender:"+gender+"\n"+
				        "math:"+math+"\n"+
	                      "English:"+english+"\n"+
	                          "chinese:"+chinese+"\n";
		return info;
	}
	public int total(){
		int total=math + english + chinese;
		return total ;
	}
	public int avg(){
		int avg=total()/3;
		return avg;
	}
	//setter,getter
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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getChinese() {
		return chinese;
	}
	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	
}
