package aula7;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn xis = new EqXn();

        System.out.println("Informe um valor para 'A':");
        delta.setA(entrada.nextDouble());

        System.out.println("Informe um valor para 'B':");
        delta.setB(entrada.nextDouble());

        System.out.println("Informe um valor para 'C':");
        delta.setC(entrada.nextDouble());
        entrada.close();

        delta.calcularDelta();
        xis.calcularX(delta);
    }
}
