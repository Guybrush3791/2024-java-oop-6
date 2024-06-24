public class App {
    public static void main(String[] args) throws Exception {

        testSquare();
    }

    public static void testSquare() {

        Square s1 = new Square(5);
        Square s2 = new Square(10);
        Square s3 = new Square(15);
        Square s4 = new Square(20);
        Square s5 = new Square(25);

        System.out.println("-----------------------------------");
        System.out.println(s1);
        System.out.println("-----------------------------------");
        System.out.println(s2);
        System.out.println("-----------------------------------");
        System.out.println(s3);
        System.out.println("-----------------------------------");
        System.out.println(s4);
        System.out.println("-----------------------------------");
        System.out.println(s5);
        System.out.println("-----------------------------------");
        System.out.println(
                "Square counter: " + Square.getSquareCounter());
        System.out.println("-----------------------------------");
        System.out.println("Area: " + s3.getArea());

        Circle c1 = new Circle(5);
        Circle c2 = new Circle(10);
        Circle c3 = new Circle(15);
        Circle c4 = new Circle(20);
        Circle c5 = new Circle(25);

        System.out.println("-----------------------------------");
        System.out.println(c1);
        System.out.println("-----------------------------------");
        System.out.println(c2);
        System.out.println("-----------------------------------");
        System.out.println(c3);
        System.out.println("-----------------------------------");
        System.out.println(c4);
        System.out.println("-----------------------------------");
        System.out.println(c5);
        System.out.println("-----------------------------------");
    }
}
