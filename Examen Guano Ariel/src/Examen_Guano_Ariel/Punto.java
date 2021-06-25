package Examen_Guano_Ariel;

public class Punto {
    private int x;
    private int y;
    
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
        
    public void setAzarCoordenadas(int cantidad){
        int direccion = 0;
        direccion = (int)(Math.random()*2 + 1); //1 = arriba o abajo, 2 = izquierda o derecha
        int sentido = 0;
        sentido = (int)(Math.random()*2 + 1);// 1 = negativo, 2 = positivo
        if(direccion == 1){// 0 = negativo, 1 = positivo
            if(sentido == 1){
                this.y = this.y - cantidad;
            }else if(sentido == 2){
                this.y = this.y + cantidad;
            }
        }else if(direccion == 2){
            if(sentido == 1){
                this.x = this.x - cantidad;
            }else if(sentido == 2){
                this.x = this.x + cantidad;
            }
        }
    }
    
    public String mostrarCoordenadas(){
        return "Las coordenadas del punto son (" + this.x+";"+this.y+")";
    }
   
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
