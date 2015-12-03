package com.gmail.freestyle_reunion;

public class Rule {
	int type;
	int precedence;
	int[] pattern = null;
	int[] order = null;
	NanoRule[] transformations = null;
	
	
	
	public Rule(Integer... rArr) {
		super();
		this.type = rArr[0];
		this.precedence = rArr[1];
		
		int stage = 1;
		int patternLen = 0;
		int orderLen = 0;
		int ruleLen = 0;
		
		// seperate patter, order and transformation
		for (int i = 2; i < rArr.length; i++) {
			if(rArr[i] == 0){
				stage++;
			}
			else if(stage == 1){
				patternLen++;
			}else if(stage == 2){
				orderLen++;
			}else{
				ruleLen++;
			}
		}
		
		pattern = new int[patternLen];
		for (int i = 2; i < 2+pattern.length; i++) {
			pattern[i-2] = rArr[i];
		}
		
		order = new int[orderLen];
		for(int i=2+patternLen+1; i<2+patternLen+1+orderLen; i++){
			order[i-2-patternLen-1] = rArr[i];
		}
		
		transformations = new NanoRule[ruleLen/2];
		for(int i=2+patternLen+1+orderLen+1; i<rArr.length; i+=2){
			transformations[i-2-patternLen-1-orderLen-1] = new NanoRule(rArr[i], rArr[i+1]);
		}
		
//		this.pattern = pattern;
//		this.order = order;
//		this.transformations = transformations;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPrecedence() {
		return precedence;
	}
	public void setPrecedence(int precedence) {
		this.precedence = precedence;
	}
	public int[] getPattern() {
		return pattern;
	}
	public void setPattern(int[] pattern) {
		this.pattern = pattern;
	}
	public int[] getOrder() {
		return order;
	}
	public void setOrder(int[] order) {
		this.order = order;
	}
	public NanoRule[] getTransformations() {
		return transformations;
	}
	public void setTransformations(NanoRule[] transformations) {
		this.transformations = transformations;
	}
	
	
}
