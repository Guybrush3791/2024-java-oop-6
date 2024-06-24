public class Circle {

    private static final double PI = 3.14;

    private final int r;

    public Circle(int r) {

        this.r = r;
    }

    public int getR() {

        return r;
    }

    // public void setR(int r) {

    // this.r = r;
    // }

    public int getPer() {

        return (int) (2 * PI * getR());
    }

    public int getArea() {

        return (int) (PI * getR() * getR());
    }

    @Override
    public String toString() {

        return "Circle:" +
                "\nR: " + getR() +
                "\nPerimeter: " + getPer() +
                "\nArea: " + getArea();
    }
}
