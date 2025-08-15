package ventanavich;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class practico1 extends JFrame{
	
	 
		public practico1() {
		        this.setTitle("Calculadora");
		        this.setSize(800, 600);
		        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        this.setLocationRelativeTo(null);
		    
		      
		        JPanel panel1 = new JPanel();
		        JPanel panel2 = new JPanel();
		        JPanel panel3 = new JPanel();
		        
		       this.add(panel1,BorderLayout.NORTH);
		       this.add(panel2,BorderLayout.CENTER);
		       this.add(panel3,BorderLayout.SOUTH);
		       
		        JLabel etiqueta1 = new JLabel("Ingrese el primer numero:");
		        JTextField texto1 = new JTextField(5);
		        JLabel etiqueta2 = new JLabel("Ingrese el segundo numero:");
		        JTextField texto2 = new JTextField(5);
		      
		        JButton buton1 = new JButton("+");
		        JButton buton2 = new JButton("-");
		        JButton buton3 = new JButton("x");
		        JButton buton4 = new JButton("/");
		        
		            
		        panel1.setLayout(new GridLayout(10,10));
		        JLabel resultado = new JLabel();
		        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));//ESTO LO SAQUE DE UNA CLASE ANTERIOR NO DE CHATGPT
		       
		     buton1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				    String numero1 = texto1.getText();
				    int num1 = Integer.parseInt(numero1);
				    String numero2 = texto2.getText();
				    int num2 = Integer.parseInt(numero2);

				    resultado.setText("Resultado: " + (num1 + num2 ));
					
					
				}
			});
		   
		     buton2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					    String numero1 = texto1.getText();
					    int num1 = Integer.parseInt(numero1);
					    String numero2 = texto2.getText();
					    int num2 = Integer.parseInt(numero2);  			    
					    resultado.setText("Resultado: " + (num1 - num2 ));
							
					}
				});
		     
		     buton3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					    String numero1 = texto1.getText();
					    int num1 = Integer.parseInt(numero1);
					    String numero2 = texto2.getText();
					    int num2 = Integer.parseInt(numero2);
					    resultado.setText("Resultado: " + (num1 * num2 ));
												
					}
				});
		     
		     buton4.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					    String numero1 = texto1.getText();
					    int num1 = Integer.parseInt(numero1);
					    String numero2 = texto2.getText();
					    int num2 = Integer.parseInt(numero2);					    					    					    					    
					    resultado.setText("Resultado: " + (num1 / num2 ));
						
						
					}
				});
		     
		        panel1.add(etiqueta1);
		        panel1.add(texto1);
		        panel1.add(etiqueta2);
		        panel1.add(texto2);		      
		        panel2.add(buton1);
		        panel2.add(buton2);
		        panel2.add(buton3);
		        panel2.add(buton4);   
		        panel1.add(resultado);
		      
		      
		    }
	}
