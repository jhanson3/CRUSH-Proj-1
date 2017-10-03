/*
 * TriangleView.java
 * Author: Jeremiah Hanson
 * --------------------------------------------------------
 * This class sets up a view to solve problems that are 
 * related to triangles.
 */

package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;

public class TriangleView extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField height, length, hyp;
	private JTextArea heightArea, lengthArea, hypArea, answer;
	private JButton hgtButton, lgtButton, hypButton;
	

	public TriangleView() {
		
		this.setLayout(null);
		this.setLocation(0, 50);
		this.setSize(1000, 300);
		this.setBackground(Color.GREEN);
		
		initializeTextFields();
		initializeButtons();
		
		this.setLayout(null);
		
	}

	private void initializeButtons() {
		
		// Initialize height button
		hgtButton = new JButton("Calculate Height");
		hgtButton.addActionListener(new ButtonListener());
		hgtButton.setSize(200, 30);
		hgtButton.setLocation(450, 10);
		this.add(hgtButton);
		
		// Initialize length button
		lgtButton = new JButton("Calculate length");
		lgtButton.addActionListener(new ButtonListener());
		lgtButton.setSize(200, 30);
		lgtButton.setLocation(450, 50);
		this.add(lgtButton);
		
		// Initialize height button
		hypButton = new JButton("Calculate Hypotenuse");
		hypButton.addActionListener(new ButtonListener());
		hypButton.setSize(200, 30);
		hypButton.setLocation(450, 90);
		this.add(hypButton);
		
	}

	private void initializeTextFields() {
		
		// Create a new font
		Font myFont = new Font(Font.SERIF, Font.BOLD, 24);
		
		// set the height text field
		heightArea = new JTextArea();
		heightArea.setFont(myFont);
		heightArea.setText("Enter Height:");
		heightArea.setSize(200, 30);
		heightArea.setLocation(10, 10);
		heightArea.setBackground(Color.GREEN);
		height = new JTextField();
		height.setSize(200, 30);
		height.setLocation(250, 10);
		this.add(height);
		this.add(heightArea);
		
		// set the length text field
		lengthArea = new JTextArea();
		lengthArea.setFont(myFont);
		lengthArea.setText("Enter Length:");
		lengthArea.setSize(200, 30);
		lengthArea.setLocation(10, 50);
		lengthArea.setBackground(Color.GREEN);
		length = new JTextField();
		length.setSize(200, 30);
		length.setLocation(250, 50);
		this.add(length);
		this.add(lengthArea);
		
		// set the hypotenuse text field
		hypArea = new JTextArea();
		hypArea.setFont(myFont);
		hypArea.setText("Enter Hypotenuse:");
		hypArea.setSize(200, 30);
		hypArea.setLocation(10, 90);
		hypArea.setBackground(Color.GREEN);
		hyp = new JTextField();
		hyp.setSize(200, 30);
		hyp.setLocation(250, 90);
		this.add(hyp);
		this.add(hypArea);
		
		// set the answer text area
		answer = new JTextArea();
		answer.setFont(myFont);
		answer.setText("Answer:");
		answer.setSize(300, 30);
		answer.setLocation(300, 150);
		answer.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.add(answer);
		
	}
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			if (arg0.getSource() == hgtButton) {
				
			} else if (arg0.getSource() == lgtButton) {
				
			} else if (arg0.getSource() == hypButton) {
				
			}
			
		}
		
	}

	
}
