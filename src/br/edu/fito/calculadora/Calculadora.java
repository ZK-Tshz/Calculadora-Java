package br.edu.fito.calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtValor;
	private JButton btn8;
	private JButton btn9;
	private JButton btn6;
	private JButton btn5;
	private JButton btn4;
	private JButton btn3;
	private JButton btn2;
	private JButton btn1;
	private JButton btnIgual;
	private JButton btnAdicao;
	private JButton btnSubtracao;
	private JButton btnMultiplicacao;
	private JButton btnDivisao;
	private JButton btnC;
	private Double valor1, valor2,resultado;
	private String operacao;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValor = new JTextField();
		txtValor.setBackground(new Color(196, 255, 255));
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtValor.setBounds(10, 11, 250, 80);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 167, 55, 55);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(75, 167, 55, 55);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(140, 167, 55, 55);
		contentPane.add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(140, 233, 55, 55);
		contentPane.add(btn6);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(75, 233, 55, 55);
		contentPane.add(btn5);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 233, 55, 55);
		contentPane.add(btn4);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(140, 299, 55, 55);
		contentPane.add(btn3);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(75, 299, 55, 55);
		contentPane.add(btn2);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 299, 55, 55);
		contentPane.add(btn1);
		
		JButton btn0_1 = new JButton("0");
		btn0_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + "0");
			}
		});
		btn0_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn0_1.setBounds(10, 365, 55, 55);
		contentPane.add(btn0_1);
		
		btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(operacao) {
					case "+":
						try {
							valor2 = Double.parseDouble(txtValor.getText());
							resultado = valor1 + valor2;
							txtValor.setText(resultado.toString());
						} 
						catch (Exception ex) {
							JOptionPane.showMessageDialog(txtValor, ex.getMessage());
							txtValor.setText("");
						} 
						break;
					case "-":
						try {
							valor2 = Double.parseDouble(txtValor.getText());
							resultado = valor1 - valor2;
							txtValor.setText(resultado.toString());
						} 
						catch (Exception ex) {
							JOptionPane.showMessageDialog(txtValor, ex.getMessage());
							txtValor.setText("");
						}
						break;
					case "*":
						try {
							valor2 = Double.parseDouble(txtValor.getText());
							resultado = valor1 * valor2;
							txtValor.setText(resultado.toString());
						} 
						catch (Exception ex) {
							JOptionPane.showMessageDialog(txtValor, ex.getMessage());
							txtValor.setText("");
						}
						break;
					case "/":
						try {
							valor2 = Double.parseDouble(txtValor.getText());
							if(valor2 == 0.0) {
								txtValor.setText("Você sabe matemática básica?");
							}
							else {
								resultado = valor1 / valor2;
								txtValor.setText(resultado.toString());
							}
						} 
						catch (Exception ex) {
							JOptionPane.showMessageDialog(txtValor, ex.getMessage());
							txtValor.setText("");
						}
						break;
				}
			}
		});
		btnIgual.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnIgual.setBounds(140, 365, 55, 55);
		contentPane.add(btnIgual);
		
		btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					valor1 = Double.parseDouble(txtValor.getText());
					operacao = "+";
				} catch(Exception ex){
					JOptionPane.showMessageDialog(txtValor, ex.getMessage());
				}finally {
					txtValor.setText("");
				}
			}
		});
		btnAdicao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAdicao.setBounds(205, 365, 55, 55);
		contentPane.add(btnAdicao);
		
		btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					valor1 = Double.parseDouble(txtValor.getText());
					operacao = "-";
				} catch(Exception ex){
					JOptionPane.showMessageDialog(txtValor, ex.getMessage());
				}finally {
					txtValor.setText("");
				}
			}
		});
		btnSubtracao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSubtracao.setBounds(205, 299, 55, 55);
		contentPane.add(btnSubtracao);
		
		btnMultiplicacao = new JButton("x");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					valor1 = Double.parseDouble(txtValor.getText());
					operacao = "*";
				} catch(Exception ex){
					JOptionPane.showMessageDialog(txtValor, ex.getMessage());
				}finally {
					txtValor.setText("");
				}
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMultiplicacao.setBounds(205, 167, 55, 55);
		contentPane.add(btnMultiplicacao);
		
		btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					valor1 = Double.parseDouble(txtValor.getText());
					operacao = "/";
				} catch(Exception ex){
					JOptionPane.showMessageDialog(txtValor, ex.getMessage());
				}finally {
					txtValor.setText("");
				}
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDivisao.setBounds(205, 233, 55, 55);
		contentPane.add(btnDivisao);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = null;
				valor2 = null;
				resultado = null;
				operacao = null;
				txtValor.setText("");
			}
		});
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnC.setBounds(10, 102, 55, 55);
		contentPane.add(btnC);
		
		JButton btnVirgula = new JButton(".");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtValor.setText(txtValor.getText() + ".");
			}
		});
		btnVirgula.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVirgula.setBounds(75, 365, 55, 55);
		contentPane.add(btnVirgula);
	}
}
