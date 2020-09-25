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
public class MetodosEspeciais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MetodosEsp c1 = new MetodosEsp("NIC","AMARELA",0.4f);
           c1.status();
        MetodosEsp c2 = new MetodosEsp("BIC","AZUL",0.5f);
        c2.status();
        MetodosEsp c3 = new MetodosEsp("PENCIL","VERMELHA",0.5f);
        c3.status();
    }
    
}
