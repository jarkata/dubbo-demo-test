package com.jarkata.facade.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class DemoResponse implements Serializable {
    private String code;
    private String message;
}
