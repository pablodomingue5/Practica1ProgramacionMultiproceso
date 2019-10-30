package es.Studium.Practica1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Practica1 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtConsultaCmd;
	JButton btnBlocnotas = new JButton("Abrir Bloc de notas");
	JButton btnPaint = new JButton("Abrir Paint");
	JButton btnGestion = new JButton("Abrir Gestión");
	JButton btnJuego = new JButton("Abrir Juego");
	JButton btnTerminar = new JButton("TERMINAR");
	JButton btnEjecutar = new JButton("Ejecutar");
	ProcessBuilder pb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder(args);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practica1 frame = new Practica1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Practica1() {
		setTitle("PRACTICA 1 PMP ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 785, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	
	
		btnBlocnotas.setBounds(593, 35, 145, 23);
		contentPane.add(btnBlocnotas);
		btnBlocnotas.addActionListener(this);

		btnPaint.setBounds(591, 69, 125, 23);
		contentPane.add(btnPaint);
		btnPaint.addActionListener(this);


		btnGestion.setBounds(591, 103, 125, 23);
		contentPane.add(btnGestion);
		btnGestion.addActionListener(this);


		btnJuego.setBounds(591, 137, 125, 23);
		contentPane.add(btnJuego);
		btnJuego.addActionListener(this);

		JLabel lblProcesosActivos = new JLabel("Procesos Activos");
		lblProcesosActivos.setBounds(388, 190, 123, 14);
		contentPane.add(lblProcesosActivos);


		JList ListaProcesos = new JList();
		ListaProcesos.setBounds(381, 215, 244, 164);
		contentPane.add(ListaProcesos);


		btnTerminar.setBounds(651, 232, 99, 23);
		contentPane.add(btnTerminar);
		btnTerminar.addActionListener(this);

		txtConsultaCmd = new JTextField();
		txtConsultaCmd.setBounds(42, 36, 197, 22);
		contentPane.add(txtConsultaCmd);
		txtConsultaCmd.setColumns(10);


		btnEjecutar.setBounds(270, 36, 89, 23);
		contentPane.add(btnEjecutar);
		btnEjecutar.addActionListener(this);

		JTextArea txtResultadoCmd = new JTextArea();
		txtResultadoCmd.setBounds(42, 102, 244, 276);
		contentPane.add(txtResultadoCmd);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object objeto = e.getSource();
	
		if(objeto.equals(btnPaint)) {
			try {

				Runtime.getRuntime().exec("C:\\WINDOWS\\system32\\mspaint.exe");

			} catch (IOException ex) {

				System.out.println(ex);
			}
		}
		
		if (objeto.equals(btnBlocnotas)) {
			try {

				Runtime.getRuntime().exec("C:\\WINDOWS\\system32\\notepad.exe");

			} catch (IOException ex) {

				System.out.println(ex);
			}
		}
		if (objeto.equals(btnGestion)) {
			try {

				Runtime.getRuntime().exec("C:\\Users\\PABLO\\Documents\\DAM\\PROGRAMACION\\EXE PROGRAMA GESTION\\PROGRAMA GESTION PABLO DOMINGUEZ.exe");

			} catch (IOException ex) {

				System.out.println(ex);
			}

		}
		if (objeto.equals(btnJuego)) {
			try {

				Runtime.getRuntime().exec("C:\\Users\\PABLO\\Documents\\DAM\\PROGRAMACION\\JUEGO\\EXE JUEGO\\AJEDREZ_PABLODOMINGUEZ.exe");

			} catch (IOException ex) {

				System.out.println(ex);
			}

		}
	}
}