package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class RequestCodeGet {
    public static void main(String []args){
        RestAssured.baseURI="https://rahulshettyacademy.com";
        given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .when().get("/maps/api/place/get/json")
                .then().log().all().statusCode(200);
    }
}
