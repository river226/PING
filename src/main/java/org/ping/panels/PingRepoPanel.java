package org.ping.panels;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * @author river
 * This class builds the main page containers. Including the List of User accounts connected to this app, 
 * the list of repo's on the currently selected account, and the Details for a currently selected repo giving 
 * access for the user to go deeper into the account.
 * currently has place holders for the elements. 
 */
@SuppressWarnings("unused")
public class PingRepoPanel extends JPanel { 

	/**
	 *  Keep Eclipse Happy
	 */
	private static final long serialVersionUID = 1L;

	// Define Globals
	private GroupLayout layout = new GroupLayout(this);
	private PingAccountList accounts;

	// Constructor
	public PingRepoPanel() {
		this.setLayout(layout);
		buildPanel();
	}

	/**
	 * 
	 */
	private void buildPanel() {

		this.setMinimumSize(new Dimension(500, 500));
		this.setBackground(Color.white);

		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		accounts = new PingAccountList(layout);

		layout.setHorizontalGroup( // Layout Sequentially
				layout.createSequentialGroup()
				.addComponent(accounts)
				);
		layout.setVerticalGroup( // Set up parallel group for vertical
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(accounts)
						)
				);
	}
}