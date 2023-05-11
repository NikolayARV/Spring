package model;

import model.Transport.Transport;

public class Driver {
    private String name;
    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public Driver(String name) {
        this.name = name;
    }

    public void startTransport() {
        System.out.println(name + " сел(а) в " + transport.toString() );
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}
