package com.hackathon.ping.objects;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class PingWinButton extends PingButton {
	protected Icon mainImage;
	Icon secondImage;
	
	public PingWinButton(String icon, String second, String text, ActionListener a) {
		super(text, new ImageIcon(icon));
		this.addActionListener(a);
		secondImage = new ImageIcon(second);
		mainImage = super.getIcon();
	}
	


	protected void doMousePressed() {
		this.setIcon(this.getIcon().equals(mainImage) ? secondImage : mainImage);
	}
}
