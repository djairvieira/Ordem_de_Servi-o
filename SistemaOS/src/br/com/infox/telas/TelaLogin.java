package br.com.infox.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Button button = new Button("Login");
		button.setBackground(Color.GRAY);
		button.setActionCommand("btnLogin");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(button, BorderLayout.SOUTH);
		
		Label label = new Label("Usu\u00E1rio:");
		label.setBackground(Color.GRAY);
		contentPane.add(label, BorderLayout.WEST);
		
		Label label_1 = new Label("Senha:");
		label_1.setBackground(Color.GRAY);
		contentPane.add(label_1, BorderLayout.EAST);
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.GREEN);
		contentPane.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
	}

}
