package com.miclase.ejerciciopila;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Stack;

public class ventanapila extends JFrame {

	private JPanel contentPane;
	private JTextField txtExpresionMatematica;
    private JPanel contentPanel;
	
	public static void main(String[] args) {
		
					ventanapila frame = new ventanapila();
					frame.setVisible(true);
	}

	public ventanapila() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtExpresionMatematica = new JTextField();
		txtExpresionMatematica.setBounds(156, 81, 96, 19);
		contentPane.add(txtExpresionMatematica);
		txtExpresionMatematica.setColumns(10);
		
		JLabel lblExpresionMatematica = new JLabel("Expresi\u00F3n matem\u00E1tica");
		lblExpresionMatematica.setBounds(10, 84, 136, 13);
		contentPane.add(lblExpresionMatematica);
		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			String strExpresionMatematica= txtExpresionMatematica.getText();
			char [] array = strExpresionMatematica.toCharArray(); 
			Stack<String>ExpresionPila=new Stack<String>();
		    for( int i=0;i< array.length;i++) {
			if(array[i]=='(')
			  {ExpresionPila.push("(");}
					else if(array[i]==')') 
						{
						if(!ExpresionPila.empty())
							{ExpresionPila.pop();}
							else
								
							{
								ExpresionPila.push(")");break;}
							}
						}
					if(ExpresionPila.empty()) {JOptionPane.showMessageDialog(contentPane,"La expresion esta correcta");}
					else {JOptionPane.showMessageDialog(contentPane,"La expresion esta no correcta");}
							
						
			}
		});
		btnValidar.setBounds(10, 117, 77, 21);
		contentPane.add(btnValidar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(103, 118, 85, 19);
		contentPane.add(btnSalir);
	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
