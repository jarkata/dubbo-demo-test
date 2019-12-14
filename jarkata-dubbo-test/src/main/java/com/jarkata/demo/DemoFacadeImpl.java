package com.jarkata.demo;

import com.jarkata.facade.DemoFacade;
import com.jarkata.facade.request.DemoRequest;
import com.jarkata.facade.response.DemoResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class DemoFacadeImpl implements DemoFacade, InitializingBean {

    private Logger logger = LoggerFactory.getLogger(DemoFacadeImpl.class);

    @Override
    public DemoResponse invoke(DemoRequest request) {
        logger.info("请求参数：{}", request);
        DemoResponse response = new DemoResponse();
        response.setCode("000000");
        response.setMessage("success");
        return response;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("初始化日志");
    }
}
