package model.Transport;

public class Bus extends Transport {
    private String model;

    public Bus(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Bus" + model;
    }

    @Override
    public void start() {
        System.out.println(model + " готов к работе");
    }
}

