package ejercicioHiloyBarra;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BarraYHilo extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		 
		BarraYHilo frame= new BarraYHilo();
		frame.setVisible(true);
			
	}

	/**
	 * Create the frame.
	 */
	public BarraYHilo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar jprBarra = new JProgressBar();
		jprBarra.setBounds(112, 45, 230, 33);
		contentPane.add(jprBarra);
		
		JButton btnInicio = new JButton("Iniciar");
		btnInicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Thread hilo = new Thread() {
					public void run() {
						jprBarra.setStringPainted(true);
						
						try {
							for(int i=0;i<=100;i++) {
								
								
								jprBarra.setValue(i);
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
		btnInicio.setBounds(35, 144, 85, 21);
		contentPane.add(btnInicio);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(178, 144, 85, 21);
		contentPane.add(btnSalir);
	}
}
