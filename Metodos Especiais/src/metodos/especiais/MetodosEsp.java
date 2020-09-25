/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos.especiais;

/**
 *
 * @author PORTOMASTER
 */
public class MetodosEsp {
    public String Modelo;
    private float ponta;
    public String getModelo(){
        return this.Modelo;
    }    
    public void setModelo(String m){
        this.Modelo = m;
        
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    
}
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("MODELO: " + this.Modelo);
        System.out.println("PONTA:" + this.ponta);
     
    }
}
