package com.unibe.teoriaCompiladores.analizadorLexico;
/**
 * Proyecto del Analizador Léxico.
 * - Interface Gráfica para Analizar expresiones aritméticas.
 * - Panel izquierdo consiste en un editor de texto para introducir las expresiones que se van a validar. La cantidad máxima de expresiones que podrá evaluar su programa son 10.
 * - Panel Derecho consiste en el Visor de Resultados de los componentes léxicos (tokens) identificados por su programa.
 * - final de cada grupo de tokens, deberá notificar si la expresión es Válida o Incorrecta. 
 * 
 * **Integrantes
 * - Fernando Perez (13-1049)
 * - Lorenzo Alejo (13-****)
 * - Luis Peralta (13-****)
 * 
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author fernando perez
 */
public class Main extends JApplet {
    
    private static final int JFXPANEL_WIDTH_INT = 500;
    private static final int JFXPANEL_HEIGHT_INT = 300;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e) {
                }
                
                JFrame frame = new JFrame("Analizador Léxico");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JApplet applet = new Main();
                applet.init();
                
                frame.setContentPane(applet.getContentPane());
                
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                
                applet.start();
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
        
        // create JavaFX scene
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                createScene();
            }
        });
    }
    
    /**
     * Metodo para crear escena
    */
    private void createScene() {
        Button btn = new Button();
        btn.setText("Analizar");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Presionado");
            }
        });
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        fxContainer.setScene(new Scene(root));
    }
    
}
