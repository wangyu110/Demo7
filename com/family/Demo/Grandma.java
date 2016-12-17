package com.family.Demo;

public class Grandma {
	/**
	 * 奶奶类
	 * 属性：name,age
	 * 行为：info,get-up,work,play,sleep
	 */
		//属性
		private String name;
		private int age;
		//构造
		public Grandma(String name,int age){
			this.name=name;
			this.age=age;
		}
		//方法
		public String info(){
			String info="name:"+name+",age:"+age;
			return info;
		}
		public void getup(){
			System.out.println(info()+"我起床了");
		}
		public String work(){
			String work="送Baby上学";
			return work;
		}
		public String play(){
			String play="跳广场舞";
			return play;
		}
		public String sleep(){
			String sleep="我睡觉了！";
			return sleep;
		}
		//setter,getter
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}

