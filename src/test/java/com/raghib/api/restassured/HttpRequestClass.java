package com.raghib.api.restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HttpRequestClass {
    @Test
    void getUsers(){
        given()
                .when()
                    .get("http://reqres.in/api/users?page=2")
                .then()
                .statusCode(200)
                .body("page",equalTo(2))
                .log().all();
    }
}
