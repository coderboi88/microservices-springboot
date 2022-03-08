# microservices-springboot

This is the microservice which is a internal part for movie-catalog-service.
Movie Catalog service make call to this microservice to get the details of movie.

Main Project (Movie Catalog Service) - "https://github.com/coderboi88/movie-catalog-services"
Discovery Server - "https://github.com/coderboi88/Discovery-server"
rating data Service - "https://github.com/coderboi88/rating-data-service"

we use discovery server (eureka server) for the interconnection of the microservices.
All other repo except discovery server are eureka clients and register at eureka server(Discovery Server)

So to use this service we all the above project also.
