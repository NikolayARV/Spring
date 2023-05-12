import config.AppConfig;
import model.Driver;
import model.Transport.Bus;
import model.Transport.Car;
import model.Transport.Pickup;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);


        Car car = context.getBean(Car.class);
        car.start();
        Bus bus = context.getBean(Bus.class);
        bus.start();
        Pickup pickup = context.getBean(Pickup.class);
        pickup.start();

        Driver driver = context.getBean("driver", Driver.class);
        driver.startTransport();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTransport();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.startTransport();


    }
}
