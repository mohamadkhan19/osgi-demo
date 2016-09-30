package com.michaelrice.demo;

import org.osgi.framework.BundleActivator;
package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Frame1   {
	
	private JLabel label1;
	private JFrame frame;
	private JTextField txtHiEclipse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("show message");
		btnNewButton.setForeground(new Color(102, 204, 153));
		btnNewButton.setBackground(new Color(51, 0, 102));
		btnNewButton.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialouge(null, "Hello World");
				label1.setText("hello world");
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
		
		txtHiEclipse = new JTextField();
		txtHiEclipse.setText("hi eclipse");
		frame.getContentPane().add(txtHiEclipse, BorderLayout.WEST);
		txtHiEclipse.setColumns(10);
		
		label1 = new JLabel("New label");
		frame.getContentPane().add(label1, BorderLayout.CENTER);
	}

}
