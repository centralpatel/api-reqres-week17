package in.reqres.reqresinfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ReqresDeleteTest extends TestBase {
    @Test
    public void deleteAllServicesInfo() {
        Response response = given()
                //.pathParam("id",980)
                .when()
                .delete("/users/980");
        response.prettyPrint();
        response.then().statusCode(204);
    }


}
