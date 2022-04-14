package ru.simple.testing.steps;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import ru.simple.testing.dto.PostDto;


public class JsonPlaceholderApiSteps {

    private final RequestSpecification api;

    public JsonPlaceholderApiSteps() {
        RequestSpecification specs = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();
        api = RestAssured.given()
                .spec(specs)
                .contentType("application/json; charset=UTF-8")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    public PostDto createPost(PostDto dtoForCreate) {
        return api.body(dtoForCreate).post("/posts").as(PostDto.class);
    }

    public PostDto getPost(Integer id) {
        return api.get("/posts/" + id).as(PostDto.class);
    }


}
