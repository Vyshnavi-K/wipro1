package com.wipro.mettl.day5;

public class Exa_4 {
	int count=0;
	if(input1%2==0){
			count++;
		}
	if(input2%2==0){
			count++;
		}
	if(input3%2==0){
			count++;
		}
	if(input4%2==0){
			count++;
		}
	if(input5%2==0){
			count++;
		}
	if(input6.equals("even")){
		return count;
	}
	else{
		return 5-count;
	}
}