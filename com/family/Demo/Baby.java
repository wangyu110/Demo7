package com.family.Demo;

public class Baby {
	/**
	 * ������
	 * ���ԣ�name,age
	 * ��Ϊ��info,get-up,work,play,sleep
	 */
		//����
		private String name;
		private int age;
		//����
		public Baby(String name,int age){
			this.name=name;
			this.age=age;
		}
		//����
		public String info(){
			String info="name:"+name+",age:"+age;
			return info;
		}
		public void getup(){
			System.out.println(info()+"������");
		}
		public String work(){
			String work="ȥ�׶�԰";
			return work;
		}
		public String play(){
			String play="�ڼ���ˣ";
			return play;
		}
		public String sleep(){
			String sleep="��˯���ˣ�";
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
