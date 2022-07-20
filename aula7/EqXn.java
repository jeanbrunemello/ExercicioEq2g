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

    // public double calcularXp(double delta){
    // System.out.println(super.getA() + "geta");
    // //-b + sqrt(delta) / 2 * A
    // // double b = -4;
    // // double a = -1;
    // xp = (-b + Math.sqrt(delta))/ 2*a;
    // System.out.println("xp " + xp);
    // return xp;
    // }

    private void calcularXp(Delta delta) {
        // -b - sqrt(delta) / 2 * A
        xp = (-delta.getB() - Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        System.out.println("xp: " + xp);
    }

    private void calcularXn(Delta delta) {
        // -b - sqrt(delta) / 2 * A
        xn = (-delta.getB() + Math.sqrt(delta.getDelta())) / 2 * delta.getA();
        System.out.println("xn: " + xn);
    }

    public void calcularX(Delta delta) {
        if (delta.getDelta() > 0) {
            System.out.println("o valor de xn é:");
            calcularXn(delta);
            System.out.println("o valor de xp é:");
            calcularXp(delta);
        }
    }

}
