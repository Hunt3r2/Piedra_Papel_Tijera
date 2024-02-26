import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TipoResultado resultado_bot;
	TipoResultado resultado_jugador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Piedra, Papel o Tijera");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 71));
		lblNewLabel.setBounds(59, 0, 672, 95);
		contentPane.add(lblNewLabel);
		
		JLabel lblResultado = new JLabel("Resultado: ");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(33, 281, 131, 14);
		contentPane.add(lblResultado);
		
		JLabel lblResultado_1 = new JLabel("Resultado: ");
		lblResultado_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado_1.setBounds(33, 306, 430, 14);
		contentPane.add(lblResultado_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(223, 0, 326, 466);
		contentPane.add(lblNewLabel_1);
		
		JButton Piedra = new JButton("Piedra");
		Piedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bot_resultado();
				resultado_jugador = TipoResultado.Piedra;
				if (resultado_bot == TipoResultado.Tijera) {
					
					lblResultado.setText("Ganaste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
					Random nick = new Random();
					int nick_foto = nick.nextInt(2) + 1;
					switch(nick_foto) {
					case 1:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\Nicolas_Cage_Deauville_2013.jpg"));
						break;
					case 2:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\nicolas-cage-biografia-fotos.jpg"));
						break;
					}
				}
					else if(resultado_bot == TipoResultado.Piedra) {
						lblResultado.setText("Empate!");
						lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
				
				}else {
					lblResultado.setText("Perdiste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador: " + resultado_bot);
					lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\detroit.gif"));
				}
				
			}
		});
		Piedra.setBounds(96, 215, 89, 23);
		contentPane.add(Piedra);
		
		JButton btnPapel = new JButton("Papel");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bot_resultado();
				resultado_jugador = TipoResultado.Papel;
				if (resultado_bot == TipoResultado.Piedra) {
					
					lblResultado.setText("Ganaste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
					Random nick = new Random();
					int nick_foto = nick.nextInt(2) + 1;
					switch(nick_foto) {
					case 1:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\Nicolas_Cage_Deauville_2013.jpg"));
						break;
					case 2:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\nicolas-cage-biografia-fotos.jpg"));
						break;
					}
				}
					else if(resultado_bot == TipoResultado.Papel) {
					lblResultado.setText("Empate!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
				}else {
					lblResultado.setText("Perdiste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador: " + resultado_bot);
					lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\detroit.gif"));
				}
				
			}
		});
		btnPapel.setBounds(328, 432, 89, 23);
		contentPane.add(btnPapel);
		
		JButton btnTijera = new JButton("Tijera");
		btnTijera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				bot_resultado();
				resultado_jugador = TipoResultado.Tijera;
				if (resultado_bot == TipoResultado.Papel) {
					
					lblResultado.setText("Ganaste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
					Random nick = new Random();
					int nick_foto = nick.nextInt(2) + 1;
					switch(nick_foto) {
					case 1:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\Nicolas_Cage_Deauville_2013.jpg"));
						break;
					case 2:
						lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\nicolas-cage-biografia-fotos.jpg"));
						break;
					}
					
					
				}
					else if(resultado_bot == TipoResultado.Tijera) {
					lblResultado.setText("Empate!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador " + resultado_bot);
				}else {
					lblResultado.setText("Perdiste!");
					lblResultado_1.setText("Tu: " + resultado_jugador + " //2º Jugador: " + resultado_bot);
					lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\detroit.gif"));
				}
				
			}
		});
		btnTijera.setBounds(648, 215, 89, 23);
		contentPane.add(btnTijera);
		
		
		
		
	}
	
	public void bot_resultado() {
		
		Random rand = new Random();
		int num = rand.nextInt(3) + 1;
		switch(num) {
		
		case 1:
			resultado_bot = TipoResultado.Piedra;
			break;
		case 2:
			resultado_bot = TipoResultado.Papel;
			break;
		case 3:
			resultado_bot = TipoResultado.Tijera;
			break;
		}
		
	}
	
}
