package com.hackathon.ping.objects;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PingRepoOption extends PingButton {
	
	private boolean on;
	
	public PingRepoOption(String text, ImageIcon imageIcon) {
		super(text, imageIcon);
		// TODO Auto-generated constructor stub
		on = false;
	}
	
	/**
	 * @return the current on state
	 */
	public boolean setOn(){	
		return on = on ? false : true;
	}
	
	public boolean isOn() {
		return on;
	}

	@Override
	protected void doMousePressed() {
		// TODO Auto-generated method stub
		if(this.isOn()) {
			
		} // else do nothing
	}

}
