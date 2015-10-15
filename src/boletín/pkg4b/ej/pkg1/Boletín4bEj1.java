/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg4b.ej.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author plago-bergonpazos
 */
public class Boletín4bEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Consumo obx1 = new Consumo();
        
        float litros = 50 , pGas = 1.57f, vMed, km ;
        
        String resposta = JOptionPane.showInputDialog("Introduce la velocidad media=");
                vMed = Float.parseFloat(resposta);
         
        String resposta1 = JOptionPane.showInputDialog("Introduce los km=");
                km = Float.parseFloat(resposta1);
        
        
        Consumo obx2 = new Consumo(km, vMed, pGas, litros);
        
        JOptionPane.showMessageDialog(null, +obx2.consumoMedio(litros, km));
        
        
        
       
        
       
        
       
        
        
        
        
        
        
         
                
        
        
    }
    
}
