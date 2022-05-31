package in.reqres.reqresinfo;

import in.reqres.model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ReqresPostTest extends TestBase {

    @Test
    public void createUserTest() {
        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setName("Jaison");
        reqresPojo.setJob("Mechanic");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.prettyPrint();
        response.then().statusCode(201);

    }

    @Test
    public void createLoginSuccessfullyTest() {
        ReqresPojo reqresPojo = new ReqresPojo();
        reqresPojo.setEmail("jaison.mec@gmail.com");
        reqresPojo.setPassword("Jaison123");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/login");
        response.prettyPrint();
        response.then().statusCode(201);
    }
}
