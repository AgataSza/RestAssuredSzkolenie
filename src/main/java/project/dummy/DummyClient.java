package project.dummy;

import io.restassured.response.ValidatableResponse;
import project.Requests;

public class DummyClient extends Requests {

    public ValidatableResponse create(String body){
        return post("https://dummy.restapiexample.com/api/v1/create", body);
    }
}