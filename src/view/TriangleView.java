/*
 * TriangleView.java
 * Author: Jeremiah Hanson
 * --------------------------------------------------------
 * This class sets up a view to solve problems that are 
 * related to triangles.
 */

package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class TriangleView extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private JTextField height, length, hyp;
	private JTextPane heightPane, lengthPane, hypPane;
	

	public TriangleView() {
		
		this.setLayout(null);
		this.setLocation(0, 50);
		this.setSize(1000, 950);
		this.setBackground(Color.GREEN);
		
		initializeTextFields();
		
		this.setLayout(null);
		
	}

	private void initializeTextFields() {
		
		// set the height text field
		height = new JTextField();
		height.setSize(200, 30);
		height.setLocation(250, 10);
		this.add(height);
		
		// set the length text field
		length = new JTextField();
		length.setSize(200, 30);
		length.setLocation(250, 50);
		this.add(length);
		
		// set the hypo text field
		hyp = new JTextField();
		hyp.setSize(200, 30);
		hyp.setLocation(250, 90);
		this.add(hyp);
		
	}

	
}
