package weather;

import java.util.LinkedList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @RequestMapping("/cities")
    public List<City>  getCities() {
        ApplicationContext context = new AnnotationConfigApplicationContext(CityList.class);
        CityList cityList = context.getBean(CityList.class);

        List<String> cityIds = cityList.getCityIds();
        List<String> cityCityNames = cityList.getCityNames();
        List<City> cityObjectList = new LinkedList<>();

        for (int i=0; i<cityIds.size(); i++) {
            City city =  new City();
            city.setId(cityIds.get(i));
            city.setName(cityCityNames.get(i));
            cityObjectList.add(city);
        }

        return cityObjectList;
    }

}
