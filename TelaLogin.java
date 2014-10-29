package listPasswords;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldLogin;
	private JPasswordField textFieldPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setResizable(false);
		setBackground(SystemColor.inactiveCaption);
		setTitle("Guarda-Senhas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);
		
		JLabel lblEntreComSeu = new JLabel("Entre com seu Login e senha:");
		lblEntreComSeu.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblEntreComSeu.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEntreComSeu, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(160, 160, 160)));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(10, 10));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(20, 20, 20, 20));
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(3, 2, 10, 20));
		
		JLabel TextEnterLogin = new JLabel("Login:");
		panel_1.add(TextEnterLogin);
		TextEnterLogin.setFont(new Font("Tahoma", Font.ITALIC, 26));
		
		textFieldLogin = new JTextField();
		textFieldLogin.setBackground(new Color(255, 255, 255));
		
		panel_1.add(textFieldLogin);
		textFieldLogin.setForeground(new Color(0, 0, 0));
		textFieldLogin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		textFieldLogin.setColumns(10);
		
		JLabel TextEnterPassword = new JLabel("Password:");
		panel_1.add(TextEnterPassword);
		TextEnterPassword.setFont(new Font("Tahoma", Font.ITALIC, 26));
		
		textFieldPassword = new JPasswordField();
		textFieldPassword.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_1.add(textFieldPassword);
		textFieldPassword.setColumns(2);
		textFieldPassword.setToolTipText("Sua senha deve possuir 8 caracteres ou mais.");
		
		JButton buttonApagar = new JButton("Apagar");
		buttonApagar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		buttonApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(buttonApagar);
		
		JButton buttonOk = new JButton("OK");
		buttonOk.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_1.add(buttonOk);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(UIManager.getBorder("Button.border"));
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnCadastrarEExcluir = new JButton("Cadastrar e Excluir Usu\u00E1rios");
		btnCadastrarEExcluir.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel_2.add(btnCadastrarEExcluir);
	}

}
