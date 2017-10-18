package ListasDoble;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField txttipo;
	private JTextField txtcancion;
	private JTextField txtautor;
	private JTextField txtalbum;
	private JTextField txtid;
	
	ListaDoble ld=new ListaDoble();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 413);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Insertar nodo adelante");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NodoDoble nuevo=new NodoDoble();
				
				nuevo.setId(Integer.parseInt(txtid.getText()));
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setAutor(txtautor.getText());
				nuevo.setCancion(txtcancion.getText());
				nuevo.setTipo(txttipo.getText());
				
				
			ld.insertarnodoadelante(nuevo);
			JOptionPane.showMessageDialog(null,"Valores insertados adelante");
			
				
			}
		});
		btnNewButton.setBounds(63, 57, 162, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Insertar nodo atras");
		btnNewButton_1.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(63, 91, 162, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar primer nodo");
		btnNewButton_2.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(63, 125, 162, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Eliminar ultimo nodo");
		btnNewButton_3.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBounds(63, 228, 162, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Recorrido hacia adelante");
		btnNewButton_4.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(63, 160, 162, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Recorrido hacia atras");
		btnNewButton_5.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(63, 194, 162, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_8 = new JButton("Salir");
		btnNewButton_8.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton_8.setBackground(Color.ORANGE);
		btnNewButton_8.setBounds(63, 262, 162, 23);
		contentPane.add(btnNewButton_8);
		
		txttipo = new JTextField();
		txttipo.setBounds(365, 53, 162, 31);
		contentPane.add(txttipo);
		txttipo.setColumns(10);
		
		JLabel lblIngreseElDato = new JLabel("Ingrese el tipo de cancion");
		lblIngreseElDato.setBounds(365, 23, 162, 14);
		contentPane.add(lblIngreseElDato);
		
		txtcancion = new JTextField();
		txtcancion.setColumns(10);
		txtcancion.setBounds(365, 121, 162, 31);
		contentPane.add(txtcancion);
		
		JLabel lblIngreseElGenero = new JLabel("Ingrese el cancion");
		lblIngreseElGenero.setBounds(365, 95, 162, 14);
		contentPane.add(lblIngreseElGenero);
		
		txtautor = new JTextField();
		txtautor.setColumns(10);
		txtautor.setBounds(365, 258, 162, 31);
		contentPane.add(txtautor);
		
		txtalbum = new JTextField();
		txtalbum.setColumns(10);
		txtalbum.setBounds(365, 190, 162, 31);
		contentPane.add(txtalbum);
		
		JLabel lblIngreseElAutor = new JLabel("Ingrese el autor");
		lblIngreseElAutor.setBounds(365, 232, 162, 14);
		contentPane.add(lblIngreseElAutor);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el album");
		lblIngreseElAlbum.setBounds(365, 160, 162, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		txtid.setBounds(365, 326, 162, 31);
		contentPane.add(txtid);
		
		JLabel lblIngreseElId = new JLabel("Ingrese el id");
		lblIngreseElId.setBounds(365, 300, 162, 14);
		contentPane.add(lblIngreseElId);
	}
}
