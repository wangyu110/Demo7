package com.yu.Demo;



public class MyClass {
 /**
  * 班级类
  * 属性：name,boss,student[],
  * 行为：slogan()，info()，max(),min(),total(),avg(),sort()
  */
	//属性
	private String name;
	private String boss;
	private Student students[];
	//构造
	public MyClass(String name, String boss, Student students[]){
		this.name=name;
		this.boss=boss;
		this.students=students;
	}
	//方法
	public String slogan(){
		String slogan="我们是最棒的!";
				return slogan;
	}
	public String info(){
		String info="name:"+name+"\n"+
	                "boss:"+boss+"\n";
		 for (Student s : students) {
				s.info();
			}
		 return info;
	}
	public int max(){
		int max=0;
		for(Student s:students){
			if(s.total()>max){
				max=s.total();
			}
		}
		return max;
	}
	public int min(){
		int min=10000;
		for(Student s:students){
			if(s.total()<min){
				min=s.total();
			}
		}
		return min;
	}
	public int total(){
		int total=0;
		for(Student s:students){
			total =total+s.total();
		}
		return total;
	}
	public int  avg(){
	  int avg=total()/students.length;
		return avg;
	}
	public void  sort(){
		Student temp=null;
		for(int i=0;i<students.length-1;i++){
	     for(int j=0;j<students.length-i-1;j++){
	    	 if(students[j].total()<students[j+1].total()){
	    		 temp=students[j];
	    		 students[j]=students[j+1];
	    		 students[j+1]=temp;
	    	 }
	     }	
		}
		for(Student s:students){
			System.out.println(s.getName()+":"+s.total());
		}
		 
	}
	 
	//setter  getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBoss() {
		return boss;
	}
	public void setBoss(String boss) {
		this.boss = boss;
	}
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
	}
	 
	
	
	
}
