/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 * @author Kala
 */
public class HolaMundo {

    public static void main(String[] args) {
        System.out.println("ejercicio 1");
         
        System.out.println("¡Hola Mundo!");
       // No es In, es ln
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int a = 10;
        int b = 20;
        int resultado = a+b;
        System.out.println("El resultado es: " + resultado);
        System.out.println("ejercicio 2");
         
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println("El valor de booleano es: " + isTrue);
        System.out.println("El valor de booleano es: " + isFalse);
        System.out.println("ejercicio 3");
         
        byte b1 = (127);
        System.out.println("El byte es: " + b1);
        //El byte sólo llega al 127 en positivo y 128 en negativo.
        
        /*Esto es un comentario multilínea
        Hay otro tipo de comentario para documentar
        pero no lo vemos hoy :c
        */
       
        short s1 = (-32768);
        System.out.println("El dato short es: " + s1);
        
        int x = 8;
        int y = 9;
        int z = x;
        System.out.println("El valor de Z es: " + z);
        x=20;
        z = x;
        System.out.println("El valor de Z es: " + z);
        //aquí se le cambia el valor a la x
        
        double v1 = 3.4;
        double v2 = 6.7;
        double v3 = v1 + v2;
        System.out.println("La suma de v1 + v2 es: " + v3);
        
        float f1 = 3650.458f;
        float f2 = 76637.345f;
        float f3 = f1+f2;
        System.out.println("La suma de f1 + f2 es: " + f3);
        //para usar float con decimales tienes que ponerle una f al final del número
        
        //MANEJO DE OPERADORES:
        
        int a2 = 3;
        int b2 = 2;
        int c2 = a2 + b2;
        int d2 = a2 * b2;
        int e2 = a2 / b2;
        int f = a2 % b2;
        
        System.out.println("Módulo de" + a2 + " % " + b2 + "=" + f);
        
        System.out.println("El a++ primero es: " + a2++);
       //checa la a y luego ingremente
        System.out.println("El ++a primero es: " + ++a2);
       //primero incrementa y luego checa la a
       //a = 4, por lo tanto a = a+9, a=4+9
       
      
       
       //STRINGS
       String holaMundo = "¡Hola Mundo!";
       //int tamaño = holam.lenght(3);
       System.out.println(holaMundo); 
       
       char letraAenNumero = 65;
       char letra = 'A' + 1;
       System.out.println(letraAenNumero);
               
       /*String[] months = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
           "junio", "agosto", "semptiempre", "agosto", "octubre", "noviembre", "diciembre"};
       String[] days = {"lunes", "martes", "miércoles", "jueves", "viernes", "sabado", "domingo"};
       
       System.out.println(months);
       */
       String[] meses = new String[12];//va del 0 a 11
       meses[0] = "Enero";//en el espacio 0
       meses[1] = "Febrero";
       meses[2] = "Marzo";
       meses[3] = "Abril";
       meses[4] = "Mayo";
       meses[5] = "Junio";
       meses[6] = "Julio";
       meses[7] = "Agosto";
       meses[8] = "Septiembre";
       meses[9] = "Octubre";
       meses[10] = "Noviembre";
       meses[11] = "Diciembre"; 
       
       System.out.println(meses[1] + ", " + meses[5] + ", " + meses[8]); 
       
        for(int i=0; i<meses.length;i++){//lenght es igual a 4
            System.out.println("El mes es: " + meses[i]);
            }
       System.out.println("esto se ejecuta una vez");
       System.out.println("esto se ejecuta otra vez");
       System.out.print("esta línea no lleva salto al final");
       System.out.println(" -- y por eso sale pegada a esta otra");
       System.out.println("Esta línea \n se salta a la mitad");
       System.out.println("esta línea lleva tabulador \t");
       
       String[] diasInicializados = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
       
       System.out.println(diasInicializados[1]); 
       
    
       /*[] months = new int[12];
       int[] months = {1,2,3,4,5,6,7,8,9,10];
       int[] months = new int   
*/
    
        Scanner escaneador = new Scanner(System.in);
        System.out.println("Dame un número que escanear: ");
        int num = escaneador.nextInt(); // escaneador.nextInt(); lee el siguiente int que se ingrese en la consola
        System.out.println("acabas de escanear el número " + num);
        
//System.out.println("El número ingresado es: " (num) Esto NO FUNCIONA
    
        if (num<10)
          System.out.println("El número es menor a 10");
        else 
           System.out.println("El número es mayor a 10");
        //Esto mide el número que introduces arriba y lo compara con 10
        
        
        switch(num){
        case 1 :
            System.out.println("el caso es uno");
            break;
        case 2 :
            System.out.println("el caso es dos");
            break;
        default:
            System.out.println("el caso es tres");
        //si no pones break se corre al default
        }
            
            //IMPRIMIR DE 1 A 50 CON FOR
            
         for(int contador=1 ; contador<51;contador++){
            System.out.print(contador + ", "); //contador de 1 a 50
            if(contador%10==1)//cada vez que el residuo de la división entre 10 sea 1 hace salto de página
                System.out.println(contador);
            }
        
         
         
         for(int contador = 0 ; contador <= 100 ; contador+=3){
            System.out.print(contador + ", "); //múltiplos de 3
            if(contador%10==1)
                System.out.println();
            
            }
         System.out.println();
         
         int contador1 = 0;
         int vari,p;
         for(vari = 3 ,  p = 0; vari <= 100 && p ==20 ; vari+=3, contador1++, x++){
            System.out.println(vari + " ");
            System.out.println("------ x es " + p );
            //Esto no hace nada porque no se cumple una condición
         }
         
         for(String i:meses){
            System.out.println(i);//esto es For-each Loop
         }
         
         //WHILE-LOOOP
         int cont = 1;
         while(cont<51){//EN LUGAR DE 51 SE PUEDE PONER <=50
            System.out.println("Contador con While-loop: " + cont);
            cont++;
         }
         //DO-WHILE
         boolean istres =false;
         do{
            System.out.println("mínimo se ejecuta una vez ");
         }while(istres == true);
        
         
         
         //ACTIVIDAD WHILE: hacer un contador de caracteres
         
         String[] frutas = new String[6];//va del 0 a 11
         frutas[0] = "Manzana";//en el espacio 0
         frutas[1] = "Banana";
         frutas[2] = "Fresa";
         frutas[3] = "Guayaba";
         frutas[4] = "Ciruela";
         frutas[5] = "uva";
         
         int cfru=0;
         while(cfru<=5){
             System.out.println("mi fruta " + frutas[cfru] + " número " + cfru + " "
                     + "tiene " + frutas[cfru].length() + " palabras");
             cfru++;
         }
        System.out.println(frutas[0] + ", " + frutas[1] + ", " + frutas[2] + ", " + frutas[3] + ", " + frutas[4] + ", " + frutas[5]);
           
        //MANDAR LLAMAR LAS FRUTAS DE ARRIBA CON WHILE-DO
        boolean fverdadero =false;
         do{
            System.out.println("Frutas a tavés de While: " + (frutas[2]) + ", " + (frutas[4]));
         }while(fverdadero == true);
        
         for(int contador5=1 ; contador5<=frutas.length; contador5++){
            System.out.println("¿Cuántas frutas tengo? : " + contador5); //Esto tendría que contar el número de caracteres en "frutas"
            }
       
         //ESTE SIRVE para identificar la volcal a en un array
	String cadena ="Una cadena de caracteres";
	char[] arrayChar = cadena.toCharArray();
 
	for(int i=0; i<arrayChar.length; i++){
 
            if( arrayChar[i] == 'a')
		System.out.println( arrayChar[i] + " -> es la vocal a");
	else
		System.out.println( arrayChar[i] + " -> no es la vocal a");
        }
        //for(int i=0; i<meses.length;i++){//lenght es igual a 4
          //  System.out.println("El mes es: " + meses[i]);
          
          //int contadorCuatro = 0;
        //  while(contadorCuatro) <= fruta
        
                  //for(int i=0; i<meses.length;i++){//lenght es igual a 4
                  //System.out.println("El mes es: " + meses[i]);
                  
                  
            }
             }
         
        
        
         
    
    
/* Con la estrucutra queramos, qué mes estás y dia del año se le dice al ususario. 
Se le dice cuánto tiempo falta para finalizar el año.
*/

    
    

        
   
        

   
