package com.miclase.barradeprogreso;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class barradeprogreso extends JFrame {

	private JPanel contentPane;
    public JProgressBar jprBarraProgreso;
	public static void main(String[] args) {
		 
		barradeprogreso frame= new barradeprogreso();
		frame.setVisible(true);
		
	}

	 
	public barradeprogreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar jprBarraProgreso = new JProgressBar();
		jprBarraProgreso.setBounds(59, 48, 276, 35);
		contentPane.add(jprBarraProgreso);
		
		JButton btnInicio = new JButton("Iniciar");
		btnInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Thread hilo = new Thread() {
					public void run() {
						jprBarraProgreso.setStringPainted(true);
						
						try {
							for(int i=0;i<=100;i++) {
								
								
								jprBarraProgreso.setValue(i);
								Thread.sleep(150);
								
							                        } 
								}catch(Exception x) {
									System.err.println(x.getMessage());
				 			}		
					}
				};
				hilo.start(); 

			}
		});
		btnInicio.setBounds(25, 191, 85, 21);
		contentPane.add(btnInicio);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(152, 191, 85, 21);
		contentPane.add(btnSalir);
	}
	
	
   }
