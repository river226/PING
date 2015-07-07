package org.ping.panels;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JFrame;

import org.ping.git.GitInstance;
import org.ping.objects.AccountButton;

@SuppressWarnings("unused")
public class PingAccountList extends Container{
	
	/**
	 * Keep Eclipse Happy 
	 */
	private static final long serialVersionUID = 1L;
	
	private GitInstance login;
	private PingSignInPanel signin;
	private ArrayList<AccountButton> accounts;
	private GridLayout parent_layout;
	private BoxLayout account_layout;
	private JFrame list;
	

	public PingAccountList(GroupLayout layout2) {
		// TODO Auto-generated constructor stub
	}

	private ArrayList<AccountButton> generateButtons() {
		ArrayList<AccountButton> BList = new ArrayList<AccountButton>();
		
		while(true) {
			BList.add(createButton());
			break; // Keep Eclipse Happy
		} 
		
		BList.add(newAccount());
		
		return BList;
	}
	
	private AccountButton createButton() {
		// TODO
		return null;
	}

	private AccountButton newAccount() {
		
		return null;
	}
	
	public JFrame GnerateList(){
		return list;
	}
	
}