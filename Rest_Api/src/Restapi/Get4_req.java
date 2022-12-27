package Restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get4_req 
{
public static void main(String[] args) 
{
	RestAssured.baseURI="https://reqres.in/";
	RequestSpecification r = RestAssured.given();
	Response request = r.request(Method.GET,"/api/unknown");
	String value = request.asString();
	System.out.println(value);
	
}
}
