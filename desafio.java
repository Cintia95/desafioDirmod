import java.util.Scanner;

class desafio{
    public static void main (String[]args){
        // Variable con texto ingresado por el usuario
        String texto;
        System.out.println("Escriba su mensaje");
        Scanner entrada = new Scanner (System.in);
        texto = entrada.nextLine();

        // Variable para recorrer el texto
        int i = 0;
        // Variable para guardar la salida
        String salida = "";
        // Variable para guardar el ultimo valor que se utilizo
        int ultimo = 1;

        //Repeticion del proceso para cada caracter del texto ingresado
        while (i<texto.length()){
            //Verifica si corresponde a algun caracter de la tecla 2
            if (texto.charAt(i)=='a' || texto.charAt(i)=='b' || texto.charAt(i)=='c'){
                //Si la ultima tecla presionada fue un 2 marca un espacio para hacer una pausa
                if (ultimo == 2){
                    salida += " ";
                }
                salida += "2";
                if (texto.charAt(i)=='b' || texto.charAt(i)=='c'){
                    salida += "2";
                    if (texto.charAt(i)=='c'){
                        salida += "2";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 2;
            //Verifica si corresponde a algun caracter de la tecla 3
            }else if (texto.charAt(i)=='d' || texto.charAt(i)=='e' || texto.charAt(i)=='f'){
                //Si la ultima tecla presionada fue un 3 marca un espacio para hacer una pausa    
                if (ultimo == 3){
                    salida += " ";
                }
                salida += "3";
                if (texto.charAt(i)=='e' || texto.charAt(i)=='f'){
                    salida += "3";
                    if (texto.charAt(i)=='f'){
                        salida += "3";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 3;
            //Verifica si corresponde a algun caracter de la tecla 4
            }else if (texto.charAt(i)=='g' || texto.charAt(i)=='h' || texto.charAt(i)=='i'){
                //Si la ultima tecla presionada fue un 4 marca un espacio para hacer una pausa
                if (ultimo == 4){
                    salida += " ";
                }
                salida += "4";
                if (texto.charAt(i)=='h' || texto.charAt(i)=='i'){
                    salida += "4";
                    if (texto.charAt(i)=='i'){
                        salida += "4";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 4;
            //Verifica si corresponde a algun caracter de la tecla 5
            }else if (texto.charAt(i)=='j' || texto.charAt(i)=='k' || texto.charAt(i)=='l'){
                //Si la ultima tecla presionada fue un 5 marca un espacio para hacer una pausa
                if (ultimo == 5){
                    salida += " ";
                }
                salida += "5";
                if (texto.charAt(i)=='k' || texto.charAt(i)=='l'){
                    salida += "5";
                    if (texto.charAt(i)=='l'){
                        salida += "5";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 5;
            //Verifica si corresponde a algun caracter de la tecla 6
            }else if (texto.charAt(i)=='m' || texto.charAt(i)=='n' || texto.charAt(i)=='o'){
                //Si la ultima tecla presionada fue un 6 marca un espacio para hacer una pausa
                if (ultimo == 6){
                    salida += " ";
                }
                salida += "6";
                if (texto.charAt(i)=='n' || texto.charAt(i)=='o'){
                    salida += "6";
                    if (texto.charAt(i)=='o'){
                        salida += "6";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 6;
            //Verifica si corresponde a algun caracter de la tecla 7
            }else if (texto.charAt(i)=='p' || texto.charAt(i)=='q' || texto.charAt(i)=='r' || texto.charAt(i)=='s'){
                //Si la ultima tecla presionada fue un 7 marca un espacio para hacer una pausa
                if (ultimo == 7){
                    salida += " ";
                }
                salida += "7";
                if (texto.charAt(i)=='q' || texto.charAt(i)=='r' || texto.charAt(i)=='s'){
                    salida += "7";
                    if (texto.charAt(i)=='r' || texto.charAt(i)=='s'){
                        salida += "7";
                        if (texto.charAt(i)=='s'){
                            salida += "7";
                        }
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 7;
            //Verifica si corresponde a algun caracter de la tecla 8
            }else if (texto.charAt(i)=='t' || texto.charAt(i)=='u' || texto.charAt(i)=='v'){
                //Si la ultima tecla presionada fue un 8 marca un espacio para hacer una pausa
                if (ultimo == 8){
                    salida += " ";
                }
                salida += "8";
                if (texto.charAt(i)=='u' || texto.charAt(i)=='v'){
                    salida += "8";
                    if (texto.charAt(i)=='v'){
                        salida += "8";
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 8;
            //Verifica si corresponde a algun caracter de la tecla 9
            }else if (texto.charAt(i)=='w' || texto.charAt(i)=='x' || texto.charAt(i)=='y' || texto.charAt(i)=='z'){
                //Si la ultima tecla presionada fue un 9 marca un espacio para hacer una pausa
                if (ultimo == 9){
                    salida += " ";
                }
                salida += "9";
                if (texto.charAt(i)=='x' || texto.charAt(i)=='y' || texto.charAt(i)=='z'){
                    salida += "9";
                    if (texto.charAt(i)=='y' || texto.charAt(i)=='z'){
                        salida += "9";
                        if (texto.charAt(i)=='z'){
                            salida += "9";
                        }
                    }
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 9;
            }else {
                //Verifica si corresponde a un espacio
                if (texto.charAt(i)==' '){
                    salida += "0";
                }
                //Guarda la tecla utilizada para verificar en la proxima letra
                ultimo = 0;
            }

            i++;
        }
        System.out.println(salida);
    }
}