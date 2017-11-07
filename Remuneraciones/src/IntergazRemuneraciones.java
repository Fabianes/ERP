import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class IntergazRemuneraciones extends JFrame {
	//asdasdasd
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_5;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntergazRemuneraciones frame = new IntergazRemuneraciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntergazRemuneraciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 509, 327);
		contentPane.add(tabbedPane);
		
		Panel panel = new Panel();
		tabbedPane.addTab("Ingresar Persona", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblRut = new JLabel("Rut:");
		lblRut.setBounds(10, 59, 28, 14);
		panel.add(lblRut);
		
		textField = new JTextField();
		textField.setBounds(82, 56, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 87, 62, 14);
		panel.add(lblNombre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(82, 84, 86, 20);
		panel.add(textField_1);
		
		JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
		lblDireccion.setBounds(10, 115, 62, 14);
		panel.add(lblDireccion);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(82, 112, 86, 20);
		panel.add(textField_2);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setBounds(10, 143, 62, 14);
		panel.add(lblCiudad);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(82, 140, 86, 20);
		panel.add(textField_3);
		
		JLabel lblCargas = new JLabel("Cargas:");
		lblCargas.setBounds(10, 171, 62, 14);
		panel.add(lblCargas);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(82, 168, 86, 20);
		panel.add(textField_4);
		
		JLabel lblAFP = new JLabel("AFP:");
		lblAFP.setBounds(10, 199, 62, 14);
		panel.add(lblAFP);
		
		JLabel lblSueldoBase = new JLabel("Sueldo Base:");
		lblSueldoBase.setBounds(307, 59, 62, 14);
		panel.add(lblSueldoBase);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(408, 56, 86, 20);
		panel.add(textField_6);
		
		JLabel lblBonoColacion = new JLabel("Bono Colaci\u00F3n:");
		lblBonoColacion.setBounds(307, 87, 78, 14);
		panel.add(lblBonoColacion);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(408, 84, 86, 20);
		panel.add(textField_7);
		
		JLabel lblBonoMovilizacion = new JLabel("Bono Movilizaci\u00F3n:");
		lblBonoMovilizacion.setBounds(307, 115, 91, 14);
		panel.add(lblBonoMovilizacion);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(408, 112, 86, 20);
		panel.add(textField_8);
		
		Button buttonGuardar = new Button("Guardar");
		buttonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonGuardar.setBounds(424, 267, 70, 22);
		panel.add(buttonGuardar);
		
		JLabel label = new JLabel("(99999999-9)");
		label.setBounds(219, 59, 78, 14);
		panel.add(label);
		
		textField_9 = new JTextField();
		textField_9.setBounds(178, 56, 18, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(82, 196, 86, 17);
		panel.add(comboBox);
		
		Panel panel_2 = new Panel();
		tabbedPane.addTab("Agregar Remuneraci\u00F3n", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblBuscarPersona = new JLabel("Buscar Persona:");
		lblBuscarPersona.setBounds(10, 25, 78, 14);
		panel_2.add(lblBuscarPersona);
		
		textField_5 = new JTextField();
		textField_5.setBounds(98, 22, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 57, 407, 95);
		panel_2.add(textArea);
		
		Button buttonBuscarPersona = new Button("Buscar");
		buttonBuscarPersona.setBounds(347, 25, 70, 22);
		panel_2.add(buttonBuscarPersona);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 173, 62, 14);
		panel_2.add(lblFecha);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(59, 170, 78, 20);
		panel_2.add(textField_10);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 221, 407, 67);
		panel_2.add(textArea_1);
		
		Button buttonSeleccionar = new Button("Seleccionar");
		buttonSeleccionar.setBounds(424, 130, 70, 22);
		panel_2.add(buttonSeleccionar);
		
		JLabel lblFechaFormato = new JLabel("(dd-mm-aaaa)");
		lblFechaFormato.setBounds(147, 173, 70, 14);
		panel_2.add(lblFechaFormato);
		
		JLabel lblDetalle = new JLabel("Detalle:");
		lblDetalle.setBounds(10, 201, 46, 14);
		panel_2.add(lblDetalle);
		
		Button buttonGuardarRemuneracion = new Button("Guardar");
		buttonGuardarRemuneracion.setBounds(424, 266, 70, 22);
		panel_2.add(buttonGuardarRemuneracion);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Editar Remuneraci\u00F3n", null, panel_1, null);
		panel_1.setLayout(null);
	}
}
