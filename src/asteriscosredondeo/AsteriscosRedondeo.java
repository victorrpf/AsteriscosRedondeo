package asteriscosredondeo;

import java.util.Scanner;

public class AsteriscosRedondeo {

    public static void main(String[] args) {
        //aquí creo un campo texto para que el usuario pueda elegir las dimensiones de la letra B en función del número de columnas de asteriscos deseado
        Scanner TextoColumnas = new Scanner(System.in); 
        System.out.print("¿Cuántas columnas de asteriscos quieres (mínimo 3)? "); //no podría hacer la letra B con menos columnas
        int NumeroColumnas = TextoColumnas.nextInt();
        
        //por cada tres columnas de asteriscos crearé 5 filas proporcionalmente
        int NumeroFilas = NumeroColumnas * 5/3;
        
        //esta variable es para calcular la fila media de asteriscos de la letra B
        double LineaMedia = NumeroFilas/2.0;

        //esta variable es redondear a número entero la variable anterior
        long LineaMediaLong = Math.round(LineaMedia);
        
        //si el usuario escribe un número inferior a 3 saldrá un mensaje que pedirá repetirlo con número superior a 2
        if (NumeroColumnas<3){
            System.out.println("Por favor, vuelve a ejecutar con un número columnas de asteriscos superior a 2");
        }   
            //solo si el número introducido por el usuario es superior a 2 empezará el grueso del programa como tal
            else{ 
                System.out.println("Linea Media de la B: " + LineaMediaLong);
                System.out.println("Número de columnas: " + NumeroColumnas); //meramente informativo
                System.out.println("Número de filas: " + NumeroFilas); //meramente informativo
                System.out.println("Se usará un área equivalente a " + NumeroFilas*NumeroColumnas + " asteriscos para representar la letra B."); //meramente informativo
                System.out.println("");

                }      
                //aquí empezará a ejecutarse el bucle de representación de la letra B mediante asteriscos
                for(int Fila=1;Fila<=NumeroFilas;Fila++){
                    for(int Columna=1;Columna<=NumeroColumnas;Columna++){
                        if (Columna==1){ //la primera columna se irá llenando de asteriscos                    
                            System.out.print(" *");
                        }
                        else if (Fila==1 && Columna!=NumeroColumnas){ //la primera fila se irá llenando de asteriscos excepto cuando coincida con el valor de la última columna
                            System.out.print(" *");
                        }
                        else if (Fila!=1 && Fila!=NumeroFilas && Fila!=LineaMediaLong && Columna==NumeroColumnas){ //la última columna se irá llenando de asteriscos excepto cuando coincida con el valor de las filas: primera, última y media
                            System.out.print(" *");
                        }
                        else if (Fila==LineaMediaLong && Columna!=NumeroColumnas){ //la fila media se irá llenando de asteriscos excepto cuando coincida con el valor de la última columna
                            System.out.print(" *");
                        }
                        else if (Fila==NumeroFilas && Columna!=NumeroColumnas){ //la última fila se irá llenando de asteriscos excepto cuando coincida con el valor de la última columna
                            System.out.print(" *");
                        }
                        else{ //si no se cumple ninguna de las condiciones anteriores es porque quiero un espacio en blanco
                            System.out.print("  ");
                        }

                    }
                System.out.println("");
                }
            System.out.println("");
            }
    }    
//cuantas más columnas de asteriscos quiera el usuario, más se parecerá a un número 8 que una letra B

