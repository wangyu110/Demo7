package com.family.Demo;

public class Family {
/**
 * ��ͥ��
 * ���ԣ���Ա
 * ��Ϊ��һ�쿪ʼ��һ�����
 */
	//����
	private Grandpa grandpa=null;
	private Grandma grandma=null;
	private Father father=null;
	private Mather mather=null;
	private Baby baby=null;
	//����
	public Family(Grandpa grandpa,Grandma grandma,Father father,Mather mather,Baby baby){
		this.grandpa=grandpa;
		this.grandma=grandma;
		this.father=father;
		this.mather=mather;
		this.baby=baby;
	}
	//����
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
