package com.family.Demo;

public class Test {
public static void main(String[] args) {
	Family  fam=new Family(pa,ma,fa,mam,ba);
	    fam.info();
	Grandpa pa=new Grandpa("老王头", 69);
	Grandma ma=new Grandma("老太婆", 65);
	   System.out.println("getup:"+pa.info());
	   pa.getup();
	   System.out.println("work:"+pa.work());
	   System.out.println("play:"+pa.play());
	   System.out.println("sleep:"+pa.sleep());
	   System.out.println("getup:"+ma.info()); 
	   ma.getup();
	   System.out.println("work:"+ma.work());
	   System.out.println("play:"+ma.play());
	   System.out.println("sleep:"+ma.sleep());
	Father fa=new Father("老王", 40);
	   System.out.println("getup:"+fa.info());
	   fa.getup();
	   System.out.println("work:"+fa.work());
	   System.out.println("play:"+fa.play());
	   System.out.println("sleep:"+fa.sleep());
    Mather mam=new Mather("老王媳妇", 38);
	   System.out.println("getup:"+mam.info());
	   mam.getup();
	   System.out.println("work:"+mam.work());
	   System.out.println("play:"+mam.play());
	   System.out.println("sleep:"+mam.sleep());
	   Baby ba=new Baby("小王",8);
	   System.out.println("getup:"+ba.info());
	   ba.getup();
	   System.out.println("work:"+ba.work());
	   System.out.println("play:"+ba.play());
	   System.out.println("sleep:"+ba.sleep());
	   
}
}
