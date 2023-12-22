public class ShapeFactory {
    public static Shape getShape(ShapeEnum shapeEnum) {
        Shape shape = null;
        if (shapeEnum.equals(ShapeEnum.SQUARE)) {
            shape = new Square();
        } else if (shapeEnum.equals(ShapeEnum.TRIANGLE)) {
            shape = new Triangle();
        }
        return shape;
    }
}
