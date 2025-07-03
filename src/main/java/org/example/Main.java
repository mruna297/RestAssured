package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

//mport com.atlassian.oai.validator.restassured.RestAssuredRequest;

//import static org.hamcrest.Matchers.*;



public class Main {
    public static void main(String []args) {

   Response res= RestAssured.get("");
   res.getStatusCode();
   RestAssured.baseURI="https://rahulshetty.com";
   given().accept()
    }

}