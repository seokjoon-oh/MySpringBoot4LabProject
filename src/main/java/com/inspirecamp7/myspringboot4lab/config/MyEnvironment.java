package com.inspirecamp7.myspringboot4lab.config;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class MyEnvironment {

    private String mode;
}