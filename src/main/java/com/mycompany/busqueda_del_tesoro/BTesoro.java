/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.busqueda_del_tesoro;

import javax.swing.table.DefaultTableModel;
import java.util.Random;

/**
 *
 * @author Juan Sebastian
 */
public class BTesoro extends javax.swing.JFrame {

    DefaultTableModel Modelo;

    /**
     * Creates new form BTesoro
     */
    public BTesoro() {
        initComponents();
        CrearModelo();
    }

    public void CrearModelo() {
        int filas = 20; // Número de filas de la matriz (puedes cambiarlo)
        int columnas = 10; // Número de columnas de la matriz (puedes cambiarlo)
        int tesoros = 7; // Número de tesoros
        int trampas = 15; // Número de trampas

        String[][] matriz = new String[filas][columnas];
        inicializarMatriz(matriz);
        llenarMatriz(matriz, 0, 0, tesoros, trampas);
        Modelo = new DefaultTableModel(matriz, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"});
        Mapa.setModel(Modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mapa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Busqueda Del Tesoro");

        Mapa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Mapa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Mapa.setEnabled(false);
        Mapa.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(Mapa);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("SCORE");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField1.setFocusable(false);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\DOWN.png")); // NOI18N
        jButton1.setFocusPainted(false);

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\UP.png")); // NOI18N
        jButton2.setFocusPainted(false);

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\RIGHT.png")); // NOI18N
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LEFT.png")); // NOI18N
        jButton4.setFocusPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4)
                        .addGap(62, 62, 62)
                        .addComponent(jButton3)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(25, 25, 25))
        );

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setDefaultCapable(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setDefaultCapable(false);
        jButton7.setFocusPainted(false);
        jButton7.setFocusable(false);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Sebastian\\Documents\\GitHub\\Busqueda_Del_Tesoro\\src\\main\\java\\com\\mycompany\\busqueda_del_tesoro\\LIFE.png")); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setDefaultCapable(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField2.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("PISTAS");

        jButton6.setText("Solicitar Pista");
        jButton6.setFocusPainted(false);

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton8))
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel4)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BTesoro().setVisible(true);
            }
        });
    }

    // Inicializa la matriz con espacios vacíos
    public static void inicializarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
    }

    // Función recursiva para llenar la matriz
    public static void llenarMatriz(String[][] matriz, int fila, int col, int tesorosRestantes, int trampasRestantes) {
        if (fila == matriz.length) {
            return; // Caso base: se llenaron todas las filas
        }

        // Si es la casilla inicial, garantizamos que esté vacía
        if (fila == 0 && col == 0) {
            matriz[fila][col] = " ";
        } else {
            Random random = new Random();
            String valor = " ";
            if (tesorosRestantes > 0 || trampasRestantes > 0) {
                // Intenta dispersar tesoros y trampas en regiones menos ocupadas
                if (tesorosRestantes > 0 && trampasRestantes > 0) {
                    int aleatorio = random.nextInt(3); // 0: vacío, 1: tesoro, 2: trampa
                    if (aleatorio == 1 && puedeColocar(matriz, fila, col, "T") && estaDesperso(matriz, fila, col)) {
                        valor = "T";
                        tesorosRestantes--;
                    } else if (aleatorio == 2 && puedeColocar(matriz, fila, col, "X") && estaDesperso(matriz, fila, col)) {
                        valor = "X";
                        trampasRestantes--;
                    }
                } else if (tesorosRestantes > 0 && puedeColocar(matriz, fila, col, "T") && estaDesperso(matriz, fila, col)) {
                    valor = "T";
                    tesorosRestantes--;
                } else if (trampasRestantes > 0 && puedeColocar(matriz, fila, col, "X") && estaDesperso(matriz, fila, col)) {
                    valor = "X";
                    trampasRestantes--;
                }
            }
            matriz[fila][col] = valor;
        }

        // Avanzar al siguiente elemento de la matriz
        if (col < matriz[0].length - 1) {
            llenarMatriz(matriz, fila, col + 1, tesorosRestantes, trampasRestantes);
        } else {
            llenarMatriz(matriz, fila + 1, 0, tesorosRestantes, trampasRestantes);
        }
    }

    // Comprueba si se puede colocar un elemento en una posición
    public static boolean puedeColocar(String[][] matriz, int fila, int col, String tipo) {
        int[][] direcciones = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Arriba, abajo, izquierda, derecha

        for (int[] dir : direcciones) {
            int nuevaFila = fila + dir[0];
            int nuevaCol = col + dir[1];
            if (nuevaFila >= 0 && nuevaFila < matriz.length && nuevaCol >= 0 && nuevaCol < matriz[0].length) {
                if (matriz[nuevaFila][nuevaCol].equals(tipo)) {
                    return false; // Hay un tipo adyacente, no se puede colocar
                }
            }
        }
        return true;
    }

    // Verifica si una posición está dispersa de otros tesoros o trampas
    public static boolean estaDesperso(String[][] matriz, int fila, int col) {
        int rango = 2; // Define qué tan lejos debe estar de otros elementos
        for (int i = -rango; i <= rango; i++) {
            for (int j = -rango; j <= rango; j++) {
                int nuevaFila = fila + i;
                int nuevaCol = col + j;
                if (nuevaFila >= 0 && nuevaFila < matriz.length && nuevaCol >= 0 && nuevaCol < matriz[0].length) {
                    if (matriz[nuevaFila][nuevaCol].equals("T") || matriz[nuevaFila][nuevaCol].equals("X")) {
                        return false; // Hay otro elemento en el rango definido
                    }
                }
            }
        }
        return true;
    }

    // Imprime la matriz
    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mapa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
