package weather;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import java.util.List;


@Configuration
@PropertySource(value="classpath:application.properties")
public class CityList {

    @Value("#{'${city.id}'.split(',')}")
    private List<String> cityIds;

    @Value("#{'${city.name}'.split(',')}")
    private List<String> cityNames;

    public List<String> getCityIds() {
        return cityIds;
    }

    public List<String> getCityNames() {
        return cityNames;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
