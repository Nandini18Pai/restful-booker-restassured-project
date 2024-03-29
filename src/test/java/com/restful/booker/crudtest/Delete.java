package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete extends TestBase {

    @Test
    public void deleteSingleId ()  {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=ce44ae3a5756812")
                .pathParam("id", 151)
                .when().delete("{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }







}
