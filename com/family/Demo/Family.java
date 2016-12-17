package com.family.Demo;

public class Family {
/**
 * 家庭类
 * 属性：成员
 * 行为：一天开始，一天结束
 */
	//属性
	private Grandpa grandpa=null;
	private Grandma grandma=null;
	private Father father=null;
	private Mather mather=null;
	private Baby baby=null;
	//构造
	public Family(Grandpa grandpa,Grandma grandma,Father father,Mather mather,Baby baby){
		this.grandpa=grandpa;
		this.grandma=grandma;
		this.father=father;
		this.mather=mather;
		this.baby=baby;
	}
	//方法
  private void info(){
	  grandpa.info();
	  grandma.info();
	  father.info();
	  mather.info();
	  baby.info();
  }
    public void day(){
    	info();
    }
 
  
  
}
