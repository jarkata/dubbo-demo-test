package com.jarkata;

import com.jarkata.facade.DemoFacade;
import com.jarkata.facade.request.DemoRequest;
import com.jarkata.facade.response.DemoResponse;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class AppTest {

    @Autowired
    private DemoFacade demoFacade;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        DemoRequest request = new DemoRequest();
        request.setTransNo("hmywindyfsdf");
        DemoResponse invoke = demoFacade.invoke(request);
        System.out.println(invoke);
    }
}
