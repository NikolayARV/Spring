package model.Transport;

public class Pickup extends Transport {
    private String model;

    public Pickup(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void start() {
        System.out.println(model + " готов к работе");
    }

    @Override
    public String toString() {
        return "Pickup" + model;
    }
}

