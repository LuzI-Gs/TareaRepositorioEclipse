package Preguntas;


//import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPreguntas extends JFrame {

	private JPanel contentPane;
	
	
	public static void main(String[] args) {
	
	VentanaPreguntas frame= new VentanaPreguntas();
	frame.setVisible(true);
	}
	
	int intPosicion=0;
	String [] Preguntas= {
			"Java fue desarrollado por: "
			,"Oracle libera versiones de JAVA cada:"
			,"Ciclo en el cual se sabe el numero de iteraciones"
			,"Variable de entorno que indica donde estan los archivos ejecutables"
			,"Selecciona la opcion por la cual no es un sinonimo de clase"	
			};
	String [] Respuestas = {
			"Sun","Cada 6 meses","For","Path","Objeto"};
	
	Object [] Seleccion= {"","","","","",""};	

	public VentanaPreguntas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Pregunta : ");
		lblTitulo.setFont(new Font("Arial Black", Font.BOLD, 16));
		lblTitulo.setBounds(10, 10, 222, 29);
		contentPane.add(lblTitulo);
		
		JLabel lblPreguntaCuestionario = new JLabel("");
		lblPreguntaCuestionario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreguntaCuestionario.setBounds(10, 49, 416, 48);
		contentPane.add(lblPreguntaCuestionario);
		lblPreguntaCuestionario.setText(Preguntas[0]); 
		
		JRadioButton rad1 = new JRadioButton("Opcion 1");
		rad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Seleccion[intPosicion]= rad1.getLabel();			}
		});
		rad1.setBounds(6, 114, 210, 21);
		contentPane.add(rad1);
		rad1.setText("");
		
		
		JRadioButton rad2 = new JRadioButton("Opcion 2");
		rad2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion[intPosicion]= rad2.getLabel();	
			}
		});
		rad2.setBounds(6, 137, 256, 21);
		contentPane.add(rad2);
		rad2.setText("");
		
		JRadioButton rad3 = new JRadioButton("Opcion 3");
		rad3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion[intPosicion]= rad3.getLabel();	
			}
		});
		rad3.setBounds(6, 160, 290, 21);
		contentPane.add(rad3);
		rad3.setText("");
		
		JRadioButton rad4 = new JRadioButton("Opcion 4");
		rad4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Seleccion[intPosicion]= rad4.getLabel();	
			}
		});
		rad4.setBounds(6, 183, 222, 21);
		contentPane.add(rad4);
		rad4.setText("");
		ButtonGroup radOpciones =new ButtonGroup();;
		radOpciones.add(rad1);
		radOpciones.add(rad2);
		radOpciones.add(rad3);
		radOpciones.add(rad4);
		rad1.setText("Oracle");
		rad2.setText("Sun");
		rad3.setText("Apache");
		rad4.setText("Ecplise");
		JButton btnSiguiente = new JButton("Siguiente");
		JButton btnAnterios = new JButton("Anterior");
		btnAnterios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(intPosicion==4) {
					//btnSiguiente.setEnabled(true);
				}
				intPosicion--;
					lblPreguntaCuestionario.setText(Preguntas[intPosicion]);
					radOpciones.clearSelection();
					if(intPosicion==0) {
						rad1.setText("Oracle");
						rad2.setText("Sun");
						rad3.setText("Apache");
						rad4.setText("Ecplise");
					}
					if(intPosicion==1) {
						rad1.setText("Cada año");
						rad2.setText("Cada mes");
						rad3.setText("Cada 6 meses");
						rad4.setText("Cada 3 meses");
					}
					if(intPosicion==2) {
						rad1.setText("For");
						rad2.setText("While");
						rad3.setText("Do-While");
						rad4.setText("Foreach");
					}
					if(intPosicion==3) {
						rad1.setText("ClassPath");
						rad2.setText("Path");
						rad3.setText("Java_Home");
						rad4.setText("String");
					}if(intPosicion==4) {
						rad1.setText("Modelo");
						rad2.setText("Plantilla");
						rad3.setText("Modelo");
						rad4.setText("Objeto");
					}
				
			}
		});
		btnAnterios.setBounds(318, 138, 85, 21);
		contentPane.add(btnAnterios);
		btnAnterios.setEnabled(false);
		
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 if(intPosicion==0) {btnAnterios.setEnabled(true);}
				 if(intPosicion==3) {btnSiguiente.setEnabled(false);} 
			     if (intPosicion<5) {
					intPosicion++;
					lblPreguntaCuestionario.setText(Preguntas[intPosicion]);
					radOpciones.clearSelection();
					if(intPosicion==0) {
						rad1.setText("Oracle");
						rad2.setText("Sun");
						rad3.setText("Apache");
						rad4.setText("Ecplise");
					}
					if(intPosicion==1) {
						rad1.setText("Cada año");
						rad2.setText("Cada mes");
						rad3.setText("Cada 6 meses");
						rad4.setText("Cada 3 meses");
					}
					if(intPosicion==2) {
						rad1.setText("For");
						rad2.setText("While");
						rad3.setText("Do-While");
						rad4.setText("Foreach");
					}
					if(intPosicion==3) {
						rad1.setText("ClassPath");
						rad2.setText("Path");
						rad3.setText("Java_Home");
						rad4.setText("String");
					}if(intPosicion==4) {
						rad1.setText("Modelo");
						rad2.setText("Plantilla");
						rad3.setText("Modelo");
						rad4.setText("Objeto");
					}
				}
			
			}
		});
		btnSiguiente.setBounds(318, 167, 85, 21);
		contentPane.add(btnSiguiente);
		
		JButton Evaluar = new JButton("Evaluar");
		Evaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				int intCalificacion=0;
				for(int i=0;i<5;i++) {
					if(Seleccion[i].equals(Respuestas[i])) {
						intCalificacion=intCalificacion+20;
					}
				}
				
			
				JOptionPane.showMessageDialog(contentPane,"Su calificacion es de: "+ intCalificacion );
			}
		});
		Evaluar.setBounds(318, 198, 85, 21);
		contentPane.add(Evaluar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(318, 232, 85, 21);
		contentPane.add(btnSalir);
	}
}
