package org.example;

import java.util.HashMap;

public class Conversao {
    String numero;
    public int converterParaDecimal(String algarismo){
        HashMap<Character, Integer> mapeamento = new HashMap<>();

        /**
         * Base 4
         * algarismo 0 não existe
         * I, II, III, IV
         */
        mapeamento.put('I', 1);
        mapeamento.put('V', 5);
        mapeamento.put('X', 10);
        mapeamento.put('L', 50);
        mapeamento.put('C', 100);
        mapeamento.put('D', 500);
        mapeamento.put('M', 1000);

        int resultado = 0;

        for(int i = 0; i < algarismo.length(); i++){
            //Verifica se o indice é maior que zero e se o indice atual é maior que o anterior

            //Trativa para casos como "IV", onde "I" (1) está antes de "V" (5)
            if(i > 0 && mapeamento.get(algarismo.charAt(i)) > mapeamento.get(algarismo.charAt(i - 1))){

                //certo que é base 4, faço a subtração de 2 * 1 (do "I") do resultado. Corrigindo o valor para 4.
                resultado += mapeamento.get(algarismo.charAt(i)) - 2 * mapeamento.get(algarismo.charAt(i - 1));
            }else {
                //se chegar até aqui apenas adiciona o valor do algorismo ao resultado
                resultado += mapeamento.get(algarismo.charAt(i));
            }
        }
        return resultado;
    }

    public String converterParaRomano(int numero) {
        if (numero <= 0 || numero > 3999) {
            System.out.println("O número deve estar no intervalo de 1 a 3999.");
        }

        String[] milhares = {"", "M", "MM", "MMM"};
        String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] dezenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return milhares[numero / 1000] + centenas[(numero % 1000) / 100] + dezenas[(numero % 100) / 10] + unidades[numero % 10];
    }
}