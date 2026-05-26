package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import vistas.VentanaPrincipal;

public class Login extends JFrame {

    private JTextField campoUsuario;

    private JPasswordField campoPassword;

    public Login() {

        setTitle("Sneakers Store Premium");

        setSize(450, 350);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(null);

        panel.setBackground(new Color(18, 18, 18));

        add(panel);

        JLabel titulo =
                new JLabel("SNEAKERS STORE");

        titulo.setBounds(90, 30, 300, 40);

        titulo.setForeground(Color.WHITE);

        titulo.setFont(new Font("Arial", Font.BOLD, 28));

        panel.add(titulo);

        JLabel usuario =
                new JLabel("Usuario");

        usuario.setBounds(50, 110, 100, 30);

        usuario.setForeground(Color.WHITE);

        usuario.setFont(new Font("Arial", Font.PLAIN, 16));

        panel.add(usuario);

        campoUsuario = new JTextField();

        campoUsuario.setBounds(150, 110, 220, 35);

        campoUsuario.setFont(new Font("Arial", Font.PLAIN, 14));

        panel.add(campoUsuario);

        JLabel password =
                new JLabel("Contraseña");

        password.setBounds(50, 170, 100, 30);

        password.setForeground(Color.WHITE);

        password.setFont(new Font("Arial", Font.PLAIN, 16));

        panel.add(password);

        campoPassword = new JPasswordField();

        campoPassword.setBounds(150, 170, 220, 35);

        campoPassword.setFont(new Font("Arial", Font.PLAIN, 14));

        panel.add(campoPassword);

        JButton botonLogin =
                new JButton("INICIAR SESIÓN");

        botonLogin.setBounds(120, 240, 200, 40);

        botonLogin.setBackground(new Color(0, 255, 140));

        botonLogin.setForeground(Color.BLACK);

        botonLogin.setFont(new Font("Arial", Font.BOLD, 14));

        panel.add(botonLogin);

        botonLogin.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String usuario =
                        campoUsuario.getText();

                String password =
                        new String(campoPassword.getPassword());

                if (usuario.equals("admin")
                        && password.equals("1234")) {

                    JOptionPane.showMessageDialog(
                            null,
                            "Bienvenido " + usuario
                    );

                    VentanaPrincipal ventana =
                            new VentanaPrincipal();

                    ventana.setVisible(true);

                    dispose();
                }

                else {

                    JOptionPane.showMessageDialog(
                            null,
                            "Usuario o contraseña incorrectos"
                    );
                }
            }
        });
    }
}