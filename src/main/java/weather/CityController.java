package weather;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
