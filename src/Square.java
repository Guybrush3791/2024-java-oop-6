public class Square {

    private static int squareCounter = 0;

    private int x;

    public Square(int x) {

        setX(x);

        squareCounter++;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getPer() {

        return getX() * 4;
    }

    public int getArea() {

        return getX() * getX();
    }

    public static int getSquareCounter() {

        return squareCounter;
    }

    @Override
    public String toString() {

        return "Square:" +
                "\nX: " + getX() +
                "\nPerimeter: " + getPer() +
                "\nArea: " + getArea();
    }
}
