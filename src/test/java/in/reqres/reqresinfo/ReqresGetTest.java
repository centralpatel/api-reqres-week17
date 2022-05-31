package in.reqres.reqresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ReqresGetTest extends TestBase {

    @Test
    public void getListUsersTest() {
        Response response = given()
                .when()
                .get("/users?page=2");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void getSingleUserTest() {
        Response response = given()
                .when()
                .get("/users/10");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
