package com.base2.kagura.services.camel.routes;

import com.base2.kagura.services.camel.utils.TestUtils;
import com.jayway.restassured.response.ResponseBody;
import junit.framework.Assert;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import static com.jayway.restassured.RestAssured.expect;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author aubels
 *         Date: 28/08/13
 */
public class ServerRoutesSystemTest extends CamelSpringTestSupport {

    @Test
    public void test()
    {
        expect().body(equalTo("hi")).when().get("http://localhost:8432/server/test");
    }

    @Override
    protected AbstractApplicationContext createApplicationContext() {
        return TestUtils.testUtils();
    }
}