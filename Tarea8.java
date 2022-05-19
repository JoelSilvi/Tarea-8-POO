package tarea8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tarea8 extends JFrame implements ActionListener {
	JPanel panel = new JPanel();

	JLabel labelNombres = new JLabel("Nombre");
	JTextField textNombre = new JTextField(20);

	JLabel labelRUT = new JLabel("RUT");
	JTextField textRUT = new JTextField(20);

	JLabel labelFono = new JLabel("Telefono");
	JTextField textFono = new JTextField(20);

	JLabel labelDireccion = new JLabel("Direccion");
	JTextField textDireccion = new JTextField(20);

	JLabel labelModelo = new JLabel("Modelo");
	JTextField textModelo = new JTextField(20);

	JLabel labelAnio = new JLabel("Año");
	JTextField textAnio = new JTextField(20);

	JLabel labelMarca = new JLabel("Marca");
	JTextField textMarca = new JTextField(20);

	JButton b;

	public Tarea8() {
		setSize(1000, 1200);

		panel.setLayout(null);
		b = new JButton("Ingresar Datos");
		b.setBounds(20, 10, 200, 40);

		labelNombres.setBounds(300, 10, 100, 40);
		textNombre.setBounds(370, 10, 400, 40);

		labelRUT.setBounds(300, 60, 100, 40);
		textRUT.setBounds(370, 60, 400, 40);

		labelFono.setBounds(300, 110, 100, 40);
		textFono.setBounds(370, 110, 400, 40);

		labelDireccion.setBounds(300, 160, 100, 40);
		textDireccion.setBounds(370, 160, 400, 40);

		labelModelo.setBounds(300, 210, 100, 40);
		textModelo.setBounds(370, 210, 400, 40);

		labelAnio.setBounds(300, 260, 100, 40);
		textAnio.setBounds(370, 260, 400, 40);

		labelMarca.setBounds(300, 310, 100, 40);
		textMarca.setBounds(370, 310, 400, 40);

		panel.add(b);

		panel.add(labelNombres);
		panel.add(textNombre);

		panel.add(labelRUT);
		panel.add(textRUT);

		panel.add(labelFono);
		panel.add(textFono);

		panel.add(labelDireccion);
		panel.add(textDireccion);

		panel.add(labelModelo);
		panel.add(textModelo);

		panel.add(labelAnio);
		panel.add(textAnio);

		panel.add(labelMarca);
		panel.add(textMarca);

		add(panel);
		b.addActionListener(this);

	}

	public static void main(String[] args) {
		JFrame tarea8 = new Tarea8();
		tarea8.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}