package com.yu.Demo;

public class Test {
	public static void main(String[] args) {	
	   Student stud1=new Student("王1", "男", 70, 50,80);
	   Student stud2=new Student("王2", "男", 50, 60,90);
	   Student stud3=new Student("王3", "男", 30, 60,30);
	   Student stud4=new Student("王4", "男", 60, 70,40);
	   Student stud5=new Student("王5", "男", 70, 90,70);
	    
//	        System.out.println(stud1.info());
//	        System.out.println(stud1.total());
//	        System.out.println(stud1.avg());
        Student[] students={stud1,stud2,stud3,stud4,stud5};
        MyClass m1=new MyClass("c1班", "老张",students);
        	 
        	System.out.println(m1.info()); 
        	System.out.println(m1.slogan());
        	System.out.println(m1.max());
        	System.out.println(m1.min());
        	System.out.println(m1.total());
        	System.out.println(m1.avg());
        	m1.sort();
        	
            
            
          
          
}
}