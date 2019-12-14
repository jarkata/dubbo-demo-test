package com.jarkata.facade;

import com.jarkata.facade.request.DemoRequest;
import com.jarkata.facade.response.DemoResponse;

public interface DemoFacade {

    DemoResponse invoke(DemoRequest request);
}
