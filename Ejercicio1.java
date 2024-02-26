import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int nota;
	private int num_aciertos;
	private int num_errores;
	private int num_preguntas;
	private String nota_nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JSpinner spinneraciertos = new JSpinner();
		spinneraciertos.setBounds(117, 37, 30, 20);
		contentPane.add(spinneraciertos);
		
		JSpinner spinner_fallos = new JSpinner();
		spinner_fallos.setBounds(117, 62, 30, 20);
		contentPane.add(spinner_fallos);
		
		JLabel lblAciertos = new JLabel("Numero aciertos");
		lblAciertos.setBounds(27, 40, 109, 14);
		contentPane.add(lblAciertos);
		
		JLabel lblFallos = new JLabel("Numero fallos");
		lblFallos.setBounds(27, 65, 109, 14);
		contentPane.add(lblFallos);
		
		JLabel lblNewLabel_1 = new JLabel("Calculador de nota");
		lblNewLabel_1.setForeground(new Color(204, 0, 0));
		lblNewLabel_1.setBackground(new Color(102, 204, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(7, 0, 130, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(153, 0, 281, 261);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\david.lejo\\Desktop\\detroit.gif"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nota");
		lblNewLabel_2.setBounds(0, 167, 147, 14);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinnerPreguntas = new JSpinner();
		spinnerPreguntas.setBounds(117, 87, 30, 20);
		contentPane.add(spinnerPreguntas);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num_preguntas = (int) spinnerPreguntas.getValue();
				num_aciertos = (int) spinneraciertos.getValue();
				num_errores = (int) spinner_fallos.getValue();
				
				nota = ((num_aciertos -(num_errores/2))*10)/num_preguntas;
				
				if(nota >= 9)
				{
					nota_nombre = "Sobresaliente";
				}else if(nota < 9 & nota > 6)
				{
					nota_nombre = "Notable";
				}else if(nota  == 6)
				{
					nota_nombre = "Bien";
				}else if(nota == 5)
				{
					nota_nombre = "Suficiente";
				}else if(nota < 5)
				{
					nota_nombre = "Insufiente";
				}else if(nota > 9 || nota <= 7)
				{
					nota_nombre = "No válida";
				}
				lblNewLabel_2.setText("Nota:" + nota + " " + nota_nombre);
				
				
				
			}
		});
		
		btnNewButton.setBounds(27, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNumeroPreguntas = new JLabel("Numero preguntas");
		lblNumeroPreguntas.setBounds(27, 90, 109, 14);
		contentPane.add(lblNumeroPreguntas);
		

		
		
		
	}
}
