public class Main {
    public static void main(String[] args) {
        Shape square = ShapeFactory.getShape(ShapeEnum.SQUARE);
        Shape triangle = ShapeFactory.getShape(ShapeEnum.TRIANGLE);
        square.draw();
        triangle.draw();
    }
}
