# weather-app-city-rest-api
This application reads the city details from the property file and exposes it in the form of REST API

##### Run the below command in the project home directory to build and deploy the REST API. 
>mvnw spring-boot:run

##### REST endpoint which returns list of city objects containing cityId (for Weather API) and CityName (for Dropdown menu)
>http://localhost:8080/cities 