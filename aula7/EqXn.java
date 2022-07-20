package aula7;

import java.lang.Math;

public class EqXn {
    double xn;
    double xp;

    // #region get/set
    public double getXn() {
        return xn;
    }

    public void setXn(double xn) {
        this.xn = xn;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }
    // #endregion

    private void calcularXp(Delta delta) {
        // -b - sqrt(delta) / 2 * A
        xp = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        System.out.println(xp);
    }

    private void calcularXn(Delta delta) {
        // -b - sqrt(delta) / 2 * A
        xn = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        System.out.println(xn);
    }

    public void calcularX(Delta delta) {
        if (delta.getDelta() > 0) {
            System.out.println("calculando os valores de xn e xp");
            System.out.print("o valor de xn é: ");
            calcularXn(delta);
            System.out.print("o valor de xp é: ");
            calcularXp(delta);
        } else {
            System.out.println("Erro. Delta <= 0 não possui raíz");
        }
    }
}
