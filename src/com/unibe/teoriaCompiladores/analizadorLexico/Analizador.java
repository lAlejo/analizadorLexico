/*
 * Proyecto del Analizador Léxico.
 * - Interface Gráfica para Analizar expresiones aritméticas.
 * - Panel izquierdo consiste en un editor de texto para introducir las expresiones que se van a validar. La cantidad máxima de expresiones que podrá evaluar su programa son 10.
 * - Panel Derecho consiste en el Visor de Resultados de los componentes léxicos (tokens) identificados por su programa.
 * - final de cada grupo de tokens, deberá notificar si la expresión es Válida o Incorrecta. 
 */
package com.unibe.teoriaCompiladores.analizadorLexico;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author fernando
 */
public class Analizador {
    
    public static final int MAX_EXPRESIONES = 10;
    
    /**
     * Metodo para analizar expresiones lexica
     * @param expresiones arreglo para obtener las expresiones a evaluar, obtendra un maximo de 'MAX_EXPRESIONES' expresiones
     * @return expAnalizadas son las expresiones analizadas, es un hashMap que tendrá el mismo orden que las expresiones que están como parámetros
     * @author Lorenzo Alejo y Luis Peralta
    */
    public static HashMap<String,List<String>> analizarExpresiones(List<String> expresiones){
        HashMap<String, List<String>> expAnalizadas = new HashMap<>();
        String analisis;
        int count = 0;
        for (String expresion: expresiones){
           //TODO: poner la parte a analizar aqui
            
            
            
            //end: poner la parte a analizar aqui
            
            if (++count == MAX_EXPRESIONES) break;
        }
        return expAnalizadas;
    }    
    
}
