public enum ShapeEnum {
    SQUARE ("square"),
    TRIANGLE ("triangle");

    private String tipo;

    ShapeEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
