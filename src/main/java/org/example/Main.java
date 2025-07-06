package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;






public class Main {
    public static void main(String []args) {

   RestAssured.baseURI="https://rahulshetty.com";
   //In given : All the inputs like param, headers and body will be given
   //In when : request[endpoint] is being submitted, hence, request type and resource from the request will be taken
   //In then : is to check the status code of the request
   // all the above three will be linked with baseURL by chained functionality
     given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
             .body("{\n" +
                     "  \"location\": {\n" +
                     "    \"lat\": -38.383494,\n" +
                     "    \"lng\": 33.427362\n" +
                     "  },\n" +
                     "  \"accuracy\": 50,\n" +
                     "  \"name\": \"Frontline house\",\n" +
                     "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                     "  \"address\": \"29, side layout, cohen 09\",\n" +
                     "  \"types\": [\n" +
                     "    \"shoe park\",\n" +
                     "    \"shop\"\n" +
                     "  ],\n" +
                     "  \"website\": \"http://google.com\",\n" +
                     "  \"language\": \"French-IN\"\n" +
                     "}")
             .when().post("/maps/api/place/add/json")
             .then().log().all().assertThat().statusCode(200);
    //.log().all() : is displays all the inputted data and response code on the output screen

    }}
