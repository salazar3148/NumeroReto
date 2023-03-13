package com.example.numeros;

public class NumeroService {
    //Respuesta en O(1)
    public Integer obtenerTotal(Integer n) {
        int zeros = zeros(n);
        double calc = 0.111111111 * Math.pow(10, zeros);
        int total = (int) calc;
        if(n < 13 * Math.pow(10, zeros)){
            return total;
        } else {
            if(n < 14 * Math.pow(10, zeros)) return total + (n + 1 - 13 * (int) Math.pow(10, zeros));
            else return total * 10 + 1;
        }
    }
    public int zeros(int n) {
        int digits = 0;
        while(n >= 1) {
            n /= 10;
            digits++;
        }
        return digits - 2;
    }

    //Respuesta en O(n)
    public Integer obtenerTotal2(Integer n) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if(Integer.toString(i).startsWith("13")) count++;
        }
        return count;
    }
}
