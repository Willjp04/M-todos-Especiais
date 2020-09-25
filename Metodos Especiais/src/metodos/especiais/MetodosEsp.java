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
    private String cor;
    public String modelo; //ATRIBUTO
    private float ponta;  //ATRIBUTO
    private boolean tampada;//ATRIBUTO

    MetodosEsp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    public void tampar(){ //MÉTODO
       
       this.tampada = true;  
         }
    public void destampar(){
        this.tampada = false;
    }
    
    public MetodosEsp(String m, String c, float p) { //MÉTODO
     this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    
    
    }
    
    private String getModelo(){ //MÉTODO
        return this.modelo;
    }    
    public void setModelo(String m){ //MÉTODO
        this.modelo = m;
        
    }
    public float getPonta(){ //MÉTODO
        return this.ponta;
    }
    public void setPonta(float p){ //MÉTODO
        this.ponta = p;
    
}
    public void status(){ //MÉTODO
        System.out.println("SOBRE A CANETA");
        System.out.println("MODELO: " + this.modelo);
        System.out.println("PONTA: " + this.ponta);
        System.out.println("COR: " + this.cor);
        System.out.println("TAMPADA " + this.tampada);
     
    }
}
