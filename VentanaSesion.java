package paquete;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaSesion extends JFrame {
	logica gestor = new logica();

	public VentanaSesion() {
		JFrame aviso = new JFrame();
		this.setLayout(new FlowLayout());
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		logica gestor = new logica();
		JLabel texto1 = new JLabel("Complete los campos para iniciar sesion");
		JLabel nombre1 = new JLabel("Nombre : ");
		JLabel contraseña1 = new JLabel("Contraseña : ");
		JTextField nombre2 = new JTextField(6);
		JTextField contraseña2 = new JTextField(6);
		JButton butonRegistrar = new JButton("Iniciar Sesion");
		JPanel panel1 = new JPanel();
		
		
		panel1.add(texto1);
		panel1.add(nombre1);
		panel1.add(nombre2);
		panel1.add(contraseña1);
		panel1.add(contraseña2);
		panel1.add(butonRegistrar);
		this.add(panel1);
		
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		
		butonRegistrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (gestor.iniciarSesion()) {
					
				}
			}
		});
	}
}
