package paquete;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ventanaPrincipal extends JFrame {
	logica gestor = new logica();

	public ventanaPrincipal() {
		this.setLayout(new FlowLayout());
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		logica gestor = new logica();

		JLabel texto1 = new JLabel("Bienvenido al Programa!");
		JLabel texto2 = new JLabel("Porfavor seleccione donde desea ingresar");
		JButton libro = new JButton("Libro");
		JLabel textoInvisible1 = new JLabel(" ");
		JLabel textoInvisible2 = new JLabel(" ");
		JButton prestamo = new JButton("Prestamo Ceibalita");
		JPanel panel1 = new JPanel();

		texto1.setFont(new Font("Comic Sans MS", Font.BOLD, 32));

		panel1.add(texto1);
		panel1.add(texto2);
		panel1.add(textoInvisible1);
		panel1.add(libro);
		panel1.add(textoInvisible2);
		panel1.add(prestamo);

		this.add(panel1);

		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		libro.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (gestor.siguienteVentana()) {
				}
			}
		});
		prestamo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (gestor.ventanaPrestamo()) {
				}
			}
		});
	}
}
