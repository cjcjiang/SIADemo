package com.jiang.SIADemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
	@Autowired
	private CompactDisc cd;
	
	
//	public CDPlayer(CompactDisc cd) {
//		this.cd = cd;
//	}

	@Override
	public void play() {
		cd.play();

	}

}
