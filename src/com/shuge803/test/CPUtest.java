package com.shuge803.test;

public class CPUtest {
	public static void main(String args[]){
		for(;;){
			for(int i=0; i<9600000; i++);
			try{
				Thread.sleep(10);
			}
			catch(Exception e){}
		}
	}
}
