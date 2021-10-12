package Preguntas;

import Preguntas.ClaseRespuestas;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import Preguntas.ClasePreguntas;
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
	ClaseRespuestas unaRespuesta = new ClaseRespuestas ();
	ClasePreguntas unaPregunta = new ClasePreguntas();
	Object [] Seleccion= {"","","","","",""};	
	
	String [] OpcionesRad= unaRespuesta.setRespuestas(intPosicion);
	
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
		lblPreguntaCuestionario.setText(unaPregunta.getPregunta(intPosicion)); 
		
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
		
		String [] OpcionesRad= unaRespuesta.setRespuestas(intPosicion);
		radOpciones.clearSelection();
		rad1.setText(OpcionesRad[0]);
		rad2.setText(OpcionesRad[1]);
		rad3.setText(OpcionesRad[2]);
		rad4.setText(OpcionesRad[3]);
		rad1.requestFocus();
		JButton btnSiguiente = new JButton("Siguiente");
		JButton btnAnterios = new JButton("Anterior");
		btnAnterios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(intPosicion==4) {
					//btnSiguiente.setEnabled(true);
				}
				intPosicion--;
				if(intPosicion>-1) {
					lblPreguntaCuestionario.setText(unaPregunta.getPregunta(intPosicion));
					String [] OpcionesRad= unaRespuesta.setRespuestas(intPosicion);
					radOpciones.clearSelection();
					rad1.setText(OpcionesRad[0]);
					rad2.setText(OpcionesRad[1]);
					rad3.setText(OpcionesRad[2]);
					rad4.setText(OpcionesRad[3]);
					rad1.requestFocus();
					
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
					lblPreguntaCuestionario.setText(unaPregunta.getPregunta(intPosicion));
					String [] OpcionesRad= unaRespuesta.setRespuestas(intPosicion);
					radOpciones.clearSelection();
					rad1.setText(OpcionesRad[0]);
					rad2.setText(OpcionesRad[1]);
					rad3.setText(OpcionesRad[2]);
					rad4.setText(OpcionesRad[3]);
					rad1.requestFocus();
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
					if(Seleccion[i].equals(unaRespuesta.getRespuestas(i))) {
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
