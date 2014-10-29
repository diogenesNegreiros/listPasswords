package listPasswords;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class TelaConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaConsulta frame = new TelaConsulta();
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
	public TelaConsulta() {
		setResizable(false);
		setTitle("Consulta Conta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(14, 15, 15, 14));
		contentPane.setLayout(new BorderLayout(10, 12));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setHgap(0);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(1, 0, 1, 0));
		panel_1.add(panel);
		panel.setLayout(new GridLayout(1, 4, 5, 0));
		
		JButton btnConsulta = new JButton("Consultar Contas");
		btnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnConsulta);
		
		JButton btnIxcluir = new JButton("Editar Contas");
		panel.add(btnIxcluir);
		
		JButton btnEditar = new JButton("Usu\u00E1rios");
		panel.add(btnEditar);
		
		JButton btnApagar = new JButton("In\u00EDcio");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnApagar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane.add(panel_2, BorderLayout.NORTH);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(2, 5, 2, 5));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(1, 3, 10, 0));
		
		JLabel lblBuscar = new JLabel("Buscar uma Conta:");
		panel_4.add(lblBuscar);
		
		textField = new JTextField(24);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		panel_4.add(btnOk);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEADING);
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		contentPane.add(panel_3, BorderLayout.CENTER);
		
		JLabel lblLista = new JLabel("Lista:");
		panel_3.add(lblLista);
		
		JTextArea textArea = new JTextArea(9,42);
		JScrollPane scroll = new JScrollPane(textArea);
		panel_3.add(scroll);
	}

}
