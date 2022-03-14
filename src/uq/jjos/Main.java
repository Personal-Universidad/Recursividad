package uq.jjos;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World with Java in Ubuntu");
        /**
         * Hallar el mayor número del vector [9,18,25,31,14,12,9]de forma recursiva
         */
        int[] vectorLargest = {9,18,91,31,14,12,9};
        //System.out.println(findLargestNumber(vectorLargest, 0, 0));

        /**
         *Dado un vector de tamaño A, realice combinaciones de maximo 2 digitos [2,1,8,7]
         */
        int[] vectorWithoutCombinations = {2,1,8,7};
        ArrayList<Integer> resultCombinations = findCombinations(vectorWithoutCombinations, 0, 0, new ArrayList<Integer>());
        for (int i = 0; i < resultCombinations.size(); i++) {
            System.out.print(resultCombinations.get(i) + " ");

        }
    }
    public static ArrayList<Integer> findCombinations(int[] vector, int pos1, int pos2, ArrayList<Integer> result){
        if(pos2 == vector.length) return  result;
        else{
            if(pos1 == vector.length){
                return findCombinations(vector, 0, pos2 + 1, result);
            }else{
                if(vector[pos2] != vector[pos1]) result.add(Integer.valueOf(vector[pos2]+""+vector[pos1]));
                return findCombinations(vector, pos1 + 1, pos2, result);
            }

        }

    }
    public static  int findLargestNumber(int[] vector, int pos, int mayor){
        if(pos == vector.length) return mayor;
        else{
            if(mayor< vector[pos]) mayor = vector[pos];
            return findLargestNumber(vector, pos +1 , mayor);
        }
    }
}
