package Ejercicio1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtNumIteraciones;
	private JTextArea txtArea;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSerie frame = new VentanaSerie();
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
	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(49, 95, 75, 30);
		contentPane.add(lblNumero1);
		
		JLabel lblNumero2 = new JLabel("Numero 2");
		lblNumero2.setBounds(49, 130, 75, 16);
		contentPane.add(lblNumero2);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(167, 101, 96, 19);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(167, 129, 96, 19);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtNumIteraciones = new JTextField();
		txtNumIteraciones.setBounds(167, 153, 96, 19);
		contentPane.add(txtNumIteraciones);
		txtNumIteraciones.setColumns(10);
		
		JLabel lblNumeroDeIteracion = new JLabel("Num de interaciones");
		lblNumeroDeIteracion.setHorizontalAlignment(SwingConstants.LEFT);
		lblNumeroDeIteracion.setBounds(10, 147, 147, 30);
		contentPane.add(lblNumeroDeIteracion);
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		
		});
		btnSalir.setBounds(10, 218, 85, 21);
		contentPane.add(btnSalir);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			    int intNumero1=Integer.parseInt(txtNumero1.getText());
			    int intNumero2=Integer.parseInt(txtNumero2.getText());
				int intNumeroIteracion=Integer.parseInt(txtNumIteraciones.getText());
				int Suma=0;
				String CadenaSerie= "";
				for(int i=0;i<=intNumeroIteracion;i++) {
					Suma=intNumero1+intNumero2;
		            System.out.println(Suma);
		            intNumero1=intNumero2;
		            intNumero2=Suma;
		            CadenaSerie=CadenaSerie+"\n"+Suma;
				}
					txtArea.setText(CadenaSerie);
			}
		});
		btnGenerar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
			
			}
			
		});
		btnGenerar.setBounds(10, 187, 85, 21);
		contentPane.add(btnGenerar);
		txtArea = new JTextArea();
		txtArea.setBounds(273, 16, 153, 223);
		contentPane.add(txtArea);
		
		JLabel lblTitulo = new JLabel("Serie");
		lblTitulo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 16));
		lblTitulo.setBounds(49, 22, 108, 30);
		contentPane.add(lblTitulo);
		
	}
}
