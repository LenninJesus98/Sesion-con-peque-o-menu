
package forwhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Lennin
 */
public class Operadores {
    
    public String Operadores(){
        return null;
    }
    
    double a,b,suma,resta, multiplicacion,division,cuentaatras, intervalo;
    public double suma(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        suma=a+b;
        JOptionPane.showMessageDialog(null, suma);
        return suma;
    }
        public double resta(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        resta=a-b;
        JOptionPane.showMessageDialog(null, resta);
        return resta;
    }
            public double multiplicacion(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        multiplicacion=a*b;
        JOptionPane.showMessageDialog(null, multiplicacion);
        return multiplicacion;
    }
                public double division(){
        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
        division=a/b;
        JOptionPane.showMessageDialog(null, division);
        return division;
    }
                
                        public int Menuop(){
             int opc=Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenidos al mini programa"
                + "\nEscoja la opción\n"
                + "\n1.Suma"
                + "\n2.Resta"
                + "\n3.Multiplicacion"
                + "\n4.Division"
                + "\n5.Conteo de numeros positivos o negativos"
                + "\n6.Otro"
                + "\n7.Salir"));
        return opc;
}
                        //
    public int rep()throws IOException{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        //Declarando las variables
        double n, numeros, numerosdepositivos=0, s=0, s1=0, prop = 0, prone, t=0;
        //clase=system atributo= out metodo=println
        //Mensaje en consola
        System.out.println("Ingrese la cantidad de numeros a evualuar");
        //Leer por teclado tipo BufferedReader
        n= (Double.valueOf(in.readLine ()));
        //Generar la condicional for
        for(int i=0; i<n; i++){
            //i=0; quiere decir el numero donde va a comenzar
            //i<n; Es numero de veces 
            //i++ Es la actualizacion puede ser incremento o decremento 
            System.out.println("Ingrese un numero");
            numeros=(Double.valueOf(in.readLine()));
            //Usamos if si ingresamos un numero "0" deberia repetir hasta ingresar un
                 //   numero mayor a cero
            if(numeros==0){
                System.out.println("Vuelva a ingresar un numero ");
           }        
            //Para contar los numeros positivos
                else if(numeros>0){
            numerosdepositivos++; //Sirve para contar cuantos numeros hemos ingresado
            s=s+numeros;
            }
            //Para contar los numeros negativos
            if (numeros<0){
                 t++;
           s1=s1+numeros;
            }
        }//Se termina la condicional For
        // Si queremos sacar el promedio de los numeros negativos
        //o positivos
                prop=s/numerosdepositivos;
                prone=s1/t;
            //Mensaje en consola-->el resultado    
        System.out.println("El total de los postivos "+numerosdepositivos);
        System.out.println("El total de los negativos "+t);
        System.out.println("El promedio de los postivos "+prop);
        System.out.println("El promedio de los negativos "+prone);  
        return 0;
            }
    
    public int sesion(){
            int n = 0;
            int cont=4;
            int ci = 1718472085;
            int ced = 0;
            
           do {            
            

  while(ced!=1718472085){
                Scanner teclado= new Scanner(System.in);
                System.out.print("Introduzca la cedula: ");
                ced=teclado.nextInt();
                if (ced==ci){
		   System.out.println("exito");
                   //Operadores run=new Operadores();
                    System.out.println("Continue");
                //   run.Menuop();
                }	
                else {
		   --cont;
                System.out.println("cedula incorrecta, " + "le queda " + cont + " intentos");
                if (cont==0){
		   System.out.println("Se ha excedido el numero de intentos");
                   System.exit(0);

	   }
	   //n=n+1; 	   
                }	
    }
           } while (ced==ci);
        return ced;

    }
                        }
