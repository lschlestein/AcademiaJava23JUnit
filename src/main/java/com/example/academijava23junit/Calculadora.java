package com.example.academijava23junit;

import org.springframework.context.annotation.Bean;

public class Calculadora {
    public float somar(float a, float b){
        return a+b;
    }
    public float subtrair(float a, float b){
        return a-b;
    }
    public float dividir(float a, float b){
        if(b==0) throw new RuntimeException("Não é possivel dividir por zero");
        return a/b;
    }

    public float multiplicar(float a, float b){
        return a*b;
    }
}
