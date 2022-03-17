package uq.jjos;

public class RecursividadCrusada {
    public static void main(String[] arg){
        /**
         * Calcular el promedio de n hasta m donde determine la cantidad de n Primos
         */
        //System.out.print(calcularPromedioPrimos(5,10,0,0));

        /**
         * Sumar los numeros abudantes de un arreglo [5,9,3,8,16,28,10,23]
         */
        int [] arreglo = {28};
        System.out.println(sumatoriaNumerosAbundantes(arreglo, 0, 0));
    }
    public static int sumatoriaNumerosAbundantes(int[] arreglo, int pos, int sumatoriaAbudantes) {
        if(pos == arreglo.length) {
            return sumatoriaAbudantes;
        }else {
            if(esNumeroAbundante(arreglo[pos], 1, 0)) {
                return sumatoriaNumerosAbundantes(arreglo, pos + 1, sumatoriaAbudantes + arreglo[pos]);
            }else {
                return sumatoriaNumerosAbundantes(arreglo, pos + 1, sumatoriaAbudantes);
            }
        }
    }

    public static  boolean esNumeroAbundante(int numero, int pos, int  sumatoria) {
        if(numero == pos) {
            return  numero > sumatoria;
        }else {
            if (numero % pos == 0) {
                return esNumeroAbundante(numero, pos  + 1 , sumatoria  + pos);
            }else{
                return esNumeroAbundante(numero, pos + 1 , sumatoria);
            }
        }
    }

    public static boolean esPrimo(int numero, int divisor, int divisores ){
        if(divisor == 0) {
            return divisores <= 2;
        }else{
            if(numero % divisor == 0) {
                return esPrimo(numero, divisor - 1 , divisores + 1 );
            }else {
                return esPrimo(numero, divisor -1 , divisores);
            }
        }
    }

    public static double calcularPromedioPrimos(int numeroInicial, int numeroFinal, int cantidadPrimos, int noPrimos) {
        if(numeroInicial == numeroFinal + 1){
            return (double)(cantidadPrimos )/ (double )(cantidadPrimos + noPrimos);
        }else {
            if(esPrimo(numeroInicial, numeroInicial, 0)) {
                return  calcularPromedioPrimos(numeroInicial + 1, numeroFinal, cantidadPrimos + 1, noPrimos);
            }else {
                return  calcularPromedioPrimos(numeroInicial + 1, numeroFinal, cantidadPrimos, noPrimos + 1);
            }
        }
    }


}
