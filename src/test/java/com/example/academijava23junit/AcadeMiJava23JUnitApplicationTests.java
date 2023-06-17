package com.example.academijava23junit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class AcadeMiJava23JUnitApplicationTests {
    Calculadora c = new Calculadora();

    @Test
    void doisMaisCincoSaoSete() {//Teste de verificação se o método está trazendo o resultado esperado, utilizando Junit
        c = new Calculadora();
        Float resultado = c.somar(2, 5);
        assertEquals(resultado, c.somar(2F, 5F));
    }

    @Test
    void doisMaisCincoSaoSeteAssertJ() {//Teste de verificação se o método está trazendo o resultado esperado, utilizando AssertJ
        c = new Calculadora();
        Float resultado = c.somar(2, 5);
        assertThat(resultado).isEqualTo(c.somar(2F, 5F));
    }

    @Test
    void cincoMenosTresSaoDois() {//Teste de verificação se o método está trazendo o resultado esperado, utilizando Junit
        c = new Calculadora();
        Float resultado = c.subtrair(5, 3);
        assertEquals(resultado, c.subtrair(5F, 3F));
    }
    @Test
    void tresPorZeroJUnit() {//Teste de verificação se o método está trazendo a exceção esperada, utilizando Junit
        c = new Calculadora();
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () -> c.dividir(3F, 0F),
                "Não é possivel dividir um numero por 0"
        );
    }
    @Test
    void tresPorZeroAssertJ() {//Teste de verificação se o método está trazendo a exceção esperada, utilizando AssertJ
        c = new Calculadora();
        assertThatThrownBy(
                () -> c.dividir(3, 0))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Não é possivel dividir por zero");
    }

}
