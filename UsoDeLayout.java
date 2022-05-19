package tarea8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsoDeLayout extends JFrame implements ActionListener {
	
	private JButton btn1, btn2;
	JTextField texto = new JTextField(20);
	private JPanel panel1;
	private JPanel panel0;

	public static void main(String[] args) {
		JFrame UsoDeLayout = new UsoDeLayout();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btn1) {
			panel1.setVisible(true);
			texto.setText("Boton 1 Presionado");
		}
		if (e.getSource() == btn2) {
			texto.setText("Boton 2 Presionado");
		}
	}
	

	public UsoDeLayout() {
		super("GUI con paneles");
		setSize(500, 400);
		panel0 = new JPanel(null);
		panel0.setLayout(new GridLayout(0, 2));

		btn1 = new JButton("Boton 1");
		btn1.addActionListener(this);
		btn2 = new JButton("Boton 2");
		btn2.addActionListener(this);
		
		BorderLayout layoutPanel1 = new BorderLayout();
		layoutPanel1.setHgap(10);
		layoutPanel1.setVgap(10);
		
		panel1 = new JPanel(null);
		panel1.setLayout(layoutPanel1);
		panel1.setVisible(false);
		panel1.add(btn2, BorderLayout.PAGE_START);
		panel1.add(texto, BorderLayout.PAGE_END);

		panel0.add(btn1);
		panel0.add(panel1);
		getContentPane().add(panel0);
		setVisible(true);
	}
}