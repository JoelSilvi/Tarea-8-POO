package tarea8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsoDeBotones extends JFrame implements ActionListener
{
	JTextField text = new JTextField(20);
	JButton btnA, btnB, btnC;
	private int numClicks = 0;
	public UsoDeBotones() {
		super("Cuenta Click");
		setSize(300,200);
		setLayout(new FlowLayout());
		btnA = new JButton("Boton A");
		add(btnA);
		btnA.addActionListener(this);
		btnB = new JButton("Boton B");
		add(btnB);
		btnB.addActionListener(this);
		btnC = new JButton("Boton C");
		add(btnC);
		btnC.addActionListener(this);
		add(text);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		JFrame usoBotones = new UsoDeBotones();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnA) {
			text.setText("Boton A");
		}
		if (e.getSource() == btnB) {
			text.setText("Boton B");
		}
		if(e.getSource() == btnC) {
			text.setText("Boton C");
		}
		
		
		
	}
	
}