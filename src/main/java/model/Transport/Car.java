package model.Transport;

public class Car extends Transport {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car" +  model;
    }

    @Override
    public void start() {
        System.out.println(model + " готов к работе");
    }
}

