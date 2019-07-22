package forwhile;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Ejecucion {
    public static void main(String[] args) throws IOException {
            Operadores op= new Operadores();
            op.sesion();
            
        do{
            //llamar instancia de objeto    
           int opc=op.Menuop();
            //Creando Condicional witch
              switch(opc){
                    case 1:
                        op.suma();                
                    break;
                    case 2:
                        op.resta();
                    break;
                    case 3:
                        op.multiplicacion();
                    break;
                    case 4:
                        op.division();
                    break;
                    case 5:
                        op.rep();
                    break;
                    case 6:
                        
                    break;
                    case 7:
                        System.exit(0);
                }
        }while(!op.equals(7)); 
     
        }
     

        
    }
    

