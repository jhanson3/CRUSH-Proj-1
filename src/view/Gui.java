/*
 * Gui.java
 * Author: Jeremiah Hanson
 * ---------------------------------------------------
 * This class creates a gui interface for the students
 * to input numbers into and buttons to choose what 
 * equations to perform.
 */

package view;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame{
	
	private static final long serialVersionUID = 4938045293212738100L;

	private JPanel currView;
	private Container cp;
	private JButton triangle;
	
	// public constructor for the GUI
	public Gui() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 1000);
		this.setLocation(100, 40);
		this.setTitle("Simple Math");
		this.setLayout(null);
		cp = new Container();
		cp.setLocation(0, 50);
		this.add(cp);
		
		initializeViewButtons();
	}
	
	// This method initializes the buttons used to change the shape
	private void initializeViewButtons() {
		triangle = new JButton("Triangle");
		triangle.setEnabled(false);
		triangle.setLocation(10, 10);
		triangle.setSize(200, 30);
		this.add(triangle);
	}

}
