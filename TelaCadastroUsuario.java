package listPasswords;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroUsuario extends JFrame {

	private JPanel contentPane;
	private JPasswordField NewPass;
	private JPasswordField ConfNewPass;
	private JTextField textUserClear;
	private JTextField newUser;
	private JPasswordField passwordClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroUsuario frame = new TelaCadastroUsuario();
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
	public TelaCadastroUsuario() {
		setResizable(false);
		setTitle("Cadastro de Usu\u00E1rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(160, 160, 160)));
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(5, 5));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(10, 10, 5, 10));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new GridLayout(2, 4, 5, 5));
		
		JLabel NewUser = new JLabel("Novo Usuario");
		panel_2.add(NewUser);
		
		newUser = new JTextField();
		panel_2.add(newUser);
		newUser.setColumns(10);
		
		JLabel lblConfirmeASenha = new JLabel("Confirme o Password:");
		panel_2.add(lblConfirmeASenha);
		
		ConfNewPass = new JPasswordField();
		panel_2.add(ConfNewPass);
		
		JLabel TextPass = new JLabel("Novo Password");
		panel_2.add(TextPass);
		
		NewPass = new JPasswordField();
		panel_2.add(NewPass);
		
		JButton includ = new JButton("Incluir");
		panel_2.add(includ);
		includ.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JButton btnclear = new JButton("Limpar");
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_2.add(btnclear);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(null);
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 2, 5, 5));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		panel_4.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		scrollPane.setViewportView(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JEditorPane ativos = new JEditorPane();
		ativos.setEditable(false);
		panel_3.add(ativos);
		ativos.setText("Usu\u00E1rios Ativos :");
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(160, 160, 160)));
		panel_4.add(panel_5);
		panel_5.setLayout(new GridLayout(1, 1, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(30, 10, 50, 10));
		panel_5.add(panel);
		panel.setLayout(new GridLayout(3, 2, 10, 10));
		
		JLabel lblUserText = new JLabel("Usu\u00E1rio:");
		panel.add(lblUserText);
		
		textUserClear = new JTextField();
		panel.add(textUserClear);
		textUserClear.setColumns(14);
		
		JLabel TextClearpass = new JLabel("Password:");
		panel.add(TextClearpass);
		
		passwordClear = new JPasswordField();
		panel.add(passwordClear);
		
		JButton btnDelete = new JButton("Excluir");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnDelete);
	}

}
