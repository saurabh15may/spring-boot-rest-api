package hello;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @RequestMapping("/cities")
    public List<String> getCities() {
        ApplicationContext context = new AnnotationConfigApplicationContext(City.class);
        City city = context.getBean(City.class);
        System.out.println("---- getCities ---- "+city.getCities().toString());
        return city.getCities();
    }

    /*@RequestMapping("/cities")
    public City getCities(@RequestParam(value="name", defaultValue="World") String name) {
        System.out.println("==== in greeting ==== [name] "+name);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }*/
}
