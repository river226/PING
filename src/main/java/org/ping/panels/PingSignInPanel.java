package org.ping.panels;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class PingSignInPanel extends JPanel {
	
	/**
	 * Keep Eclipse Happy
	 */
	private static final long serialVersionUID = 1L;
	
	private BorderLayout login;
	private BoxLayout input;
	private Container frame;
	private JLabel username, password;
	private JTextField usern;
	private JPasswordField pass;
	private JButton signin, cancel;
	
	public PingSignInPanel() {
		login = new BorderLayout();
		frame = new Container();
		input = new BoxLayout(frame, BoxLayout.Y_AXIS);
		login.addLayoutComponent(frame, BorderLayout.CENTER);
	}
}