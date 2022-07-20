package aula7;

public class Delta extends Equacao {

    double delta;

    // #region gets e sets

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    // #endregion

    public void calcularDelta() {
        System.out.println("calculando delta com: A = " + super.getA() + ", B = " + super.getB() + ", C = " + super.getC());
        //delta = B² - 4 *a*c
        delta = (super.getB() * super.getB()) + (-4 * super.getA() * super.getC());
        System.out.println("delta é igual a " + delta);
        // return delta;
    }


}
