package com.nissan.model;

public class QuizClass {

	private static int count  = 1;
	private String question;
	private String actualAnswer;
	private String yourAnswer;
	private boolean scored;

	// default constructor
	public QuizClass() {}

	// overloaded constructor
	public QuizClass(String question, String actualAnswer, String yourAnswer,
			boolean scored) {
		this.question = question;
		this.actualAnswer = actualAnswer;
		this.yourAnswer = yourAnswer;
		this.scored = scored;
		count++;
	}

	public int getCount() {
		return count;
	}

	public String getQuestion() {
		return question;
	}

	public String getActualAnswer() {
		return actualAnswer;
	}

	public String getYourAnswer() {
		return yourAnswer;
	}

	public boolean isScored() {
		return scored;
	}
	
}
