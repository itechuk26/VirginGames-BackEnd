package com.virgingames.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by : Divyesh Patel
 * since : Tuesday  26/11/2019
 * Time  : 11:04
 **/

public class TestBase {

    @BeforeClass
    public static void init()
    {
        RestAssured.baseURI = "https://www.virgingames.com";
        RestAssured.basePath = "/bingo";
    }
}
