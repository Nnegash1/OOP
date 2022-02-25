public class Guitar {
    private String serialNumber;
    private double price;
    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;



    Guitar(String serialNumber, double price, String model, Builder builder, Type type,Wood backWood, Wood topWood){
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.type = type;
        this.price = price;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public void setBackWood(Wood backWood) {
        this.backWood = backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", builder=" + builder.toString() +
                ", type=" + type.toString() +
                ", backWood=" + backWood.toString() +
                ", topWood=" + topWood.toString() +
                '}';
    }
}
