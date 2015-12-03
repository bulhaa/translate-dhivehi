package com.gmail.freestyle_reunion;

public class TranslateInfo {
	String translatedText;
	int wordCount = 0;
	
	public TranslateInfo(String translatedText, int wordCount) {
		super();
		this.translatedText = translatedText;
		this.wordCount = wordCount;
	}

	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	public int getWordCount() {
		return wordCount;
	}

	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}
}
