package config;

import model.Driver;
import model.Transport.Bus;
import model.Transport.Car;
import model.Transport.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("Audi");
    }
    @Bean
    public Bus getBusBean() {
        return new Bus("Iveco");
    }
    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Ford");
    }

    @Bean(name = "driver")
    public Driver getDriver() {
        return new Driver("Федя", getCarBean() );
    }
    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Петя", getBusBean() );
    }
    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Валя", getPickupBean() );
    }
}
