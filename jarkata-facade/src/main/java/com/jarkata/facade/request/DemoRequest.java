package com.jarkata.facade.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class DemoRequest implements Serializable {

    private String transNo;
}
