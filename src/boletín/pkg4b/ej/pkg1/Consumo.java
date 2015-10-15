/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletín.pkg4b.ej.pkg1;

/**
 *
 * @author plago-bergonpazos
 */
public class Consumo {
    //Siempre private
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    

public Consumo(){
    }

public Consumo(float km,float litros,float vMed,float pGas){
    
}

public float getTempo (float km, float vMed){
    return km/vMed;
    
}

public float consumoMedio (float litros, float km){
    return litros/100*km;
}

public float consumoEuros (float pGas,float km){
    return pGas/km*100;
   
}

public void setKms (float km){
    this.km = km ;
}

public void setLitros (float litros){
this.litros = litros;
}

public void setvMed (float vMed){
    this.vMed = vMed;
}

public void setpGas (float pGas){
    this.pGas = pGas;
}





}
    
    
    

