package org.inst;

public class InstanceVeriable {
	String name="jaya";
	public void instanceName() {
		System.out.println("before instanceVeriable:"+name);
		name="surya";
		System.out.println("after InstanceVeriable:"+ name);
	}
	public void instaId() {
		System.out.println("before instaId:"+ name);
		name="kk";
		System.out.println("after instaId:"+ name);
		String name2="jayasurya";
		System.out.println(name2);
		System.out.println("length of the name:"+name2.length());
		
		
	}
       public static void main(String[] args) {
		InstanceVeriable i=new InstanceVeriable();
		i.instanceName();
		i.instaId();
	}
       
}
