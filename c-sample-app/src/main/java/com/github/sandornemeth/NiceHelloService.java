/**
 * Copyright © 2017 Corporation
 *
 * All rights reserved.
 */
package com.github.sandornemeth;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

/**
 * Nice version of saying hello.
 *
 * @author Sandor Nemeth <sandor.nemeth.1986@gmail.com>
 */
@Api("/sayHello")
@Service
public class NiceHelloService implements HelloService {

    @Override
    public String sayHello(String to) {
        return String.format("Hello Mr/Mrs %s, it's nice to meet you!", to);
    }
}
