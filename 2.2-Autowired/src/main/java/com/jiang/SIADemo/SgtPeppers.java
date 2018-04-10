package com.jiang.SIADemo;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{
	
	private String title = "SgtPeppers";
	private String artist = "Beatles";
	
	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

}
