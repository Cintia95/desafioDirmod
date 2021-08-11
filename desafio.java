import java.util.Scanner;

class desafio{
    public static void main (String[]args){
        String texto;
        System.out.println("Escriba su mensaje");
        Scanner entrada = new Scanner (System.in);
        texto = entrada.nextLine();

        int i = 0;
        String salida = "";
        int ultimo = 1;

        while (i<texto.length()){
            if (texto.charAt(i)=='a' || texto.charAt(i)=='b' || texto.charAt(i)=='c'){
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
                ultimo = 2;
            }else if (texto.charAt(i)=='d' || texto.charAt(i)=='e' || texto.charAt(i)=='f'){
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
                    ultimo = 3;
            }else if (texto.charAt(i)=='g' || texto.charAt(i)=='h' || texto.charAt(i)=='i'){
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
                ultimo = 4;
            }else if (texto.charAt(i)=='j' || texto.charAt(i)=='k' || texto.charAt(i)=='l'){
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
                ultimo = 5;
            }else if (texto.charAt(i)=='m' || texto.charAt(i)=='n' || texto.charAt(i)=='o'){
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
                ultimo = 6;
            }else if (texto.charAt(i)=='p' || texto.charAt(i)=='q' || texto.charAt(i)=='r' || texto.charAt(i)=='s'){
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
                ultimo = 7;
            }else if (texto.charAt(i)=='t' || texto.charAt(i)=='u' || texto.charAt(i)=='v'){
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
                ultimo = 8;
            }else if (texto.charAt(i)=='w' || texto.charAt(i)=='x' || texto.charAt(i)=='y' || texto.charAt(i)=='z'){
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
                ultimo = 9;
            }else {
                if (texto.charAt(i)==' '){
                    salida += "0";
                }
                ultimo = 0;
            }

            i++;
        }
        System.out.println(salida);
    }
}