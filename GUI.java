package tarea8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener
{
	JTextField text = new JTextField(20);
	JButton b;
	private int numClicks = 0;
	public GUI() {
		super("Cuenta Click");
		setSize(300,200);
		b = new JButton("Click Me");
		setLayout (new FlowLayout());
		add(b);
		add(text);
		b.addActionListener(this);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		JFrame gui = new GUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		numClicks++;
		if (numClicks == 1) {
			text.setText("Se ha contado " + numClicks + " click");
		}else {
			text.setText("Se han contado " + numClicks + " clicks");
		}
		
		
	}
	
}