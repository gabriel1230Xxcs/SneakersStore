package vistas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    private JTextArea areaCarrito;

    private JTextArea areaClientes;

    private JLabel numProductos;

    private JLabel numVentas;

    private JLabel numClientes;

    private double total = 0;

    private ArrayList<String> carrito =
            new ArrayList<>();

    private ArrayList<Double> precios =
            new ArrayList<>();

    private ArrayList<String> clientes =
            new ArrayList<>();

    public VentanaPrincipal() {

        setTitle("Sneakers Store Premium");

        setSize(1000, 850);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.setLayout(null);

        panel.setBackground(new Color(15,15,15));

        add(panel);

        // =========================================
        // TITULO
        // =========================================

        JLabel titulo =
                new JLabel("SISTEMA PREMIUM DE TENIS");

        titulo.setBounds(250,20,600,50);

        titulo.setForeground(Color.WHITE);

        titulo.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        30
                )
        );

        panel.add(titulo);

        // =========================================
        // PANEL PRODUCTOS
        // =========================================

        JPanel panelProductos =
                new JPanel();

        panelProductos.setBounds(40,90,180,80);

        panelProductos.setBackground(
                new Color(30,30,30)
        );

        panelProductos.setLayout(null);

        JLabel productos =
                new JLabel("PRODUCTOS");

        productos.setBounds(25,10,150,20);

        productos.setForeground(Color.WHITE);

        productos.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        panelProductos.add(productos);

        numProductos =
                new JLabel("0");

        numProductos.setBounds(70,35,100,30);

        numProductos.setForeground(
                new Color(0,255,140)
        );

        numProductos.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        panelProductos.add(numProductos);

        panel.add(panelProductos);

        // =========================================
        // PANEL VENTAS
        // =========================================

        JPanel panelVentas =
                new JPanel();

        panelVentas.setBounds(270,90,180,80);

        panelVentas.setBackground(
                new Color(30,30,30)
        );

        panelVentas.setLayout(null);

        JLabel ventas =
                new JLabel("VENTAS");

        ventas.setBounds(45,10,150,20);

        ventas.setForeground(Color.WHITE);

        ventas.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        panelVentas.add(ventas);

        numVentas =
                new JLabel("0");

        numVentas.setBounds(70,35,100,30);

        numVentas.setForeground(
                new Color(0,170,255)
        );

        numVentas.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        panelVentas.add(numVentas);

        panel.add(panelVentas);

        // =========================================
        // PANEL CLIENTES
        // =========================================

        JPanel panelClientes =
                new JPanel();

        panelClientes.setBounds(500,90,180,80);

        panelClientes.setBackground(
                new Color(30,30,30)
        );

        panelClientes.setLayout(null);

        JLabel clientesLabel =
                new JLabel("CLIENTES");

        clientesLabel.setBounds(35,10,150,20);

        clientesLabel.setForeground(Color.WHITE);

        clientesLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        panelClientes.add(clientesLabel);

        numClientes =
                new JLabel("0");

        numClientes.setBounds(70,35,100,30);

        numClientes.setForeground(
                new Color(255,170,0)
        );

        numClientes.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );

        panelClientes.add(numClientes);

        panel.add(panelClientes);

        // =========================================
        // PANEL GANANCIAS
        // =========================================

        JPanel panelGanancias =
                new JPanel();

        panelGanancias.setBounds(730,90,180,80);

        panelGanancias.setBackground(
                new Color(30,30,30)
        );

        panelGanancias.setLayout(null);

        JLabel ganancias =
                new JLabel("GANANCIAS");

        ganancias.setBounds(25,10,150,20);

        ganancias.setForeground(Color.WHITE);

        ganancias.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16
                )
        );

        panelGanancias.add(ganancias);

        JLabel numGanancias =
                new JLabel("RD$250K");

        numGanancias.setBounds(20,35,150,30);

        numGanancias.setForeground(
                new Color(255,80,80)
        );

        numGanancias.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        panelGanancias.add(numGanancias);

        panel.add(panelGanancias);

        // =========================================
        // IMAGENES
        // =========================================

        agregarImagen(
                panel,
                "/imagenes/jordan.png",
                40,
                220
        );

        agregarImagen(
                panel,
                "/imagenes/yeezy.png",
                260,
                220
        );

        agregarImagen(
                panel,
                "/imagenes/nike.png",
                480,
                220
        );

        agregarImagen(
                panel,
                "/imagenes/asics.png",
                700,
                220
        );

        // =========================================
        // BOTON AGREGAR PRODUCTO
        // =========================================

        JButton botonAgregar =
                new JButton("Agregar Producto");

        botonAgregar.setBounds(
                40,
                370,
                170,
                50
        );

        botonAgregar.setBackground(
                new Color(0,255,140)
        );

        botonAgregar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonAgregar);

        // =========================================
        // BOTON VER CARRITO
        // =========================================

        JButton botonCarrito =
                new JButton("Ver Carrito");

        botonCarrito.setBounds(
                230,
                370,
                170,
                50
        );

        botonCarrito.setBackground(
                new Color(0,170,255)
        );

        botonCarrito.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonCarrito);

        // =========================================
        // BOTON FACTURAR
        // =========================================

        JButton botonFacturar =
                new JButton("Facturar");

        botonFacturar.setBounds(
                420,
                370,
                170,
                50
        );

        botonFacturar.setBackground(
                new Color(255,170,0)
        );

        botonFacturar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonFacturar);

        // =========================================
        // BOTON ELIMINAR PRODUCTO
        // =========================================

        JButton botonEliminar =
                new JButton("Eliminar Producto");

        botonEliminar.setBounds(
                610,
                370,
                170,
                50
        );

        botonEliminar.setBackground(
                new Color(255,80,80)
        );

        botonEliminar.setForeground(Color.WHITE);

        botonEliminar.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonEliminar);

        // =========================================
        // BOTON SALIR
        // =========================================

        JButton botonSalir =
                new JButton("Salir");

        botonSalir.setBounds(
                800,
                370,
                120,
                50
        );

        botonSalir.setBackground(Color.GRAY);

        botonSalir.setForeground(Color.WHITE);

        botonSalir.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonSalir);

        // =========================================
        // AREA CARRITO
        // =========================================

        areaCarrito =
                new JTextArea();

        areaCarrito.setBounds(
                40,
                460,
                880,
                120
        );

        areaCarrito.setBackground(
                new Color(35,35,35)
        );

        areaCarrito.setForeground(Color.WHITE);

        areaCarrito.setEditable(false);

        areaCarrito.setFont(
                new Font(
                        "Monospaced",
                        Font.PLAIN,
                        18
                )
        );

        panel.add(areaCarrito);

        // =========================================
        // BOTON REGISTRAR CLIENTE
        // =========================================

        JButton botonRegistrarCliente =
                new JButton("Registrar Cliente");

        botonRegistrarCliente.setBounds(
                40,
                610,
                220,
                40
        );

        botonRegistrarCliente.setBackground(
                new Color(170,0,255)
        );

        botonRegistrarCliente.setForeground(Color.WHITE);

        botonRegistrarCliente.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonRegistrarCliente);

        // =========================================
        // BOTON VER CLIENTES
        // =========================================

        JButton botonVerClientes =
                new JButton("Ver Clientes");

        botonVerClientes.setBounds(
                300,
                610,
                180,
                40
        );

        botonVerClientes.setBackground(
                new Color(0,120,220)
        );

        botonVerClientes.setForeground(Color.WHITE);

        botonVerClientes.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonVerClientes);

        // =========================================
        // BOTON ELIMINAR CLIENTE
        // =========================================

        JButton botonEliminarCliente =
                new JButton("Eliminar Cliente");

        botonEliminarCliente.setBounds(
                520,
                610,
                220,
                40
        );

        botonEliminarCliente.setBackground(
                new Color(255,80,80)
        );

        botonEliminarCliente.setForeground(Color.WHITE);

        botonEliminarCliente.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        14
                )
        );

        panel.add(botonEliminarCliente);

        // =========================================
        // AREA CLIENTES
        // =========================================

        areaClientes =
                new JTextArea();

        areaClientes.setBounds(
                40,
                670,
                880,
                100
        );

        areaClientes.setBackground(
                new Color(25,25,25)
        );

        areaClientes.setForeground(Color.WHITE);

        areaClientes.setEditable(false);

        areaClientes.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        16
                )
        );

        panel.add(areaClientes);

        // =========================================
        // EVENTO AGREGAR PRODUCTO
        // =========================================

        botonAgregar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                String producto =
                        JOptionPane.showInputDialog(
                                "Ingrese producto"
                        );

                String precioTexto =
                        JOptionPane.showInputDialog(
                                "Ingrese precio"
                        );

                if(producto == null
                        || precioTexto == null) {

                    return;
                }

                double precio =
                        Double.parseDouble(
                                precioTexto
                        );

                carrito.add(
                        producto
                        + " - RD$"
                        + precio
                );

                precios.add(precio);

                total += precio;

                actualizarCarrito();

            }

        });

        // =========================================
        // EVENTO VER CARRITO
        // =========================================

        botonCarrito.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                JOptionPane.showMessageDialog(
                        null,
                        areaCarrito.getText()
                );

            }

        });

        // =========================================
        // EVENTO FACTURAR
        // =========================================

        botonFacturar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                JOptionPane.showMessageDialog(
                        null,
                        "TOTAL A PAGAR: RD$"
                        + total
                );

            }

        });

        // =========================================
        // EVENTO ELIMINAR PRODUCTO
        // =========================================

        botonEliminar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                if(carrito.size() > 0) {

                    int ultimaPosicion =
                            carrito.size() - 1;

                    carrito.remove(
                            ultimaPosicion
                    );

                    double precioEliminado =
                            precios.remove(
                                    ultimaPosicion
                            );

                    total -= precioEliminado;

                    actualizarCarrito();

                    JOptionPane.showMessageDialog(
                            null,
                            "Producto eliminado"
                    );
                }

                else {

                    JOptionPane.showMessageDialog(
                            null,
                            "No hay productos"
                    );
                }

            }

        });

        // =========================================
        // EVENTO SALIR
        // =========================================

        botonSalir.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                System.exit(0);

            }

        });

        // =========================================
        // EVENTO REGISTRAR CLIENTE
        // =========================================

        botonRegistrarCliente.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                String nombreCliente =
                        JOptionPane.showInputDialog(
                                "Ingrese nombre del cliente"
                        );

                if(nombreCliente == null) {

                    return;
                }

                clientes.add(nombreCliente);

                actualizarClientes();
            }

        });

        // =========================================
        // EVENTO VER CLIENTES
        // =========================================

        botonVerClientes.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                JOptionPane.showMessageDialog(
                        null,
                        areaClientes.getText()
                );

            }

        });

        // =========================================
        // EVENTO ELIMINAR CLIENTE
        // =========================================

        botonEliminarCliente.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(
                    ActionEvent e
            ) {

                if(clientes.size() > 0) {

                    clientes.remove(
                            clientes.size() - 1
                    );

                    actualizarClientes();
                }

            }

        });

    }

    // =========================================
    // ACTUALIZAR CARRITO
    // =========================================

    private void actualizarCarrito() {

        areaCarrito.setText("");

        numProductos.setText(
                String.valueOf(carrito.size())
        );

        numVentas.setText(
                String.valueOf(carrito.size())
        );

        for(String producto : carrito) {

            areaCarrito.append(
                    producto + "\n"
            );
        }

        areaCarrito.append(
                "\nTOTAL: RD$" + total
        );
    }

    // =========================================
    // ACTUALIZAR CLIENTES
    // =========================================

    private void actualizarClientes() {

        areaClientes.setText("");

        numClientes.setText(
                String.valueOf(clientes.size())
        );

        for(String cliente : clientes) {

            areaClientes.append(
                    cliente + "\n"
            );
        }
    }

    // =========================================
    // AGREGAR IMAGEN
    // =========================================

    private void agregarImagen(
            JPanel panel,
            String ruta,
            int x,
            int y
    ) {

        ImageIcon icono =
                new ImageIcon(
                        getClass().getResource(ruta)
                );

        Image imagen =
                icono.getImage().getScaledInstance(
                        150,
                        100,
                        Image.SCALE_SMOOTH
                );

        JLabel label =
                new JLabel(
                        new ImageIcon(imagen)
                );

        label.setBounds(
                x,
                y,
                150,
                100
        );

        panel.add(label);
    }
}