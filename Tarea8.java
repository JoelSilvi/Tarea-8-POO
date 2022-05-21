package tarea8;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tarea8 extends JFrame implements ActionListener {
	private JComboBox<String> jComboBox;
	private JComboBox<String> jComboMes;
	
	private JPanel panel = new JPanel();

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

	JLabel labelAnio = new JLabel("A�o Auto");
	JTextField textAnio = new JTextField(20);

	JLabel labelMarca = new JLabel("Marca");
	JTextField textMarca = new JTextField(20);
	
	JLabel labelRegiones = new JLabel("Regiones");	
	
	JLabel labelIngresaFecha = new JLabel("Fecha");
	
	JLabel labelDia = new JLabel("Dia");
	JTextField textDia = new JTextField(20);
	
	JLabel labelMes = new JLabel("Mes");
	
	JLabel labelAnioHoras = new JLabel("A�o");
	JTextField textAnioHoras = new JTextField(20);

	JLabel labelHora = new JLabel("Hora");
	JTextField textHora = new JTextField(20);
	
	JButton b;

	public Tarea8() {
		setSize(1000, 1200);
		panel.setLayout(null);
		b = new JButton("RESERVAR");
		b.setBounds(370, 500, 400, 40);
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		b.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		
		
		
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
		
		labelRegiones.setBounds(300, 360, 100, 40);
		
		labelIngresaFecha.setBounds(300, 410, 100, 40);
		
		labelDia.setBounds(370, 410, 40, 40);
		textDia.setBounds(395, 420, 30, 20);
		
		labelMes.setBounds(440, 410, 40, 40);
		
		labelAnioHoras.setBounds(580, 410, 40, 40);
		textAnioHoras.setBounds(610, 420, 40, 20);
		
		labelHora.setBounds(660, 410, 40, 40);
		textHora.setBounds(690, 420, 80, 20);
		
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
		
		panel.add(labelIngresaFecha);
		
		panel.add(labelDia);
		panel.add(textDia);
		
		panel.add(labelAnioHoras);
		panel.add(textAnioHoras);
		
		panel.add(labelHora);
		panel.add(textHora);
		
		
		
		String[] optionsToChoose = {"Arica y Parinacota", "Tarapac�", "Antofagasta", "Atacama", "Coquimbo", "Valpara�so", 
        		"Regi�n del Libertador Gral. Bernardo O�Higgins", "Regi�n del Maule", "Regi�n de �uble", "Regi�n del Biob�o",
        		"Regi�n de la Araucan�a", "Regi�n de Los R�os", "Regi�n de Los Lagos", "Regi�n Ais�n del Gral. Carlos Ib��ez del Campo",
        		"Regi�n de Magallanes y de la Ant�rtica Chilena", "Regi�n Metropolitana de Santiago"};
		
		String[] eligeMes = {"ENERO", "FEBRERO","MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE","DICIEMBRE"};
		
		
		jComboBox = new JComboBox<>(optionsToChoose);
		jComboMes = new JComboBox<>(eligeMes);
		
		
		
		panel.add(labelRegiones);
		jComboBox.setBounds(370, 360, 400, 40);
		panel.add(jComboBox);
		
		panel.add(labelMes);
		jComboMes.setBounds(470, 420, 100, 20);
		panel.add(jComboMes);
		
		add(panel);
		b.addActionListener(this);

	}

	public static void main(String[] args) {
		JFrame tarea8 = new Tarea8();	
		tarea8.setVisible(true);
		
	}	


	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
		
		
		
		if (e.getSource() == b) {
			JOptionPane.showMessageDialog(null, ("EL NOMBRE ES:    "+ textNombre.getText() + "\nEL RUT ES:    " + textRUT.getText() + 
					"\nEL TELEFONO ES:    " + textFono.getText() + "\nLA DIRECCION ES:    " + textDireccion.getText() + "\nEL MODELO ES:    " 
					+ textModelo.getText() + "\nEL VEH�CULO ES DEL A�O:    " + textAnio.getText() + "\nLA MARCA DEL AUTOMOVIL ES:    " 
					+ textMarca.getText() + "\nLA REGION ES:    " + jComboBox.getSelectedItem() + 
					"\nPARA EL D�A:    " + textDia.getText() + " DE " + jComboMes.getSelectedItem() + 
					"\nA�O " + textAnio.getText() + " A las    " + textHora.getText()), "RESERVA DE HORAS", WIDTH); 
			
			
			panel.setVisible(true);
		}
	}

}