package com.practice.miscellany.verification.currency;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;

public class BigDecimalDemo {
    public static void main(String[] args) throws IOException {
        System.out.println(0.05 + 0.01);
        BigDecimal b1 = new BigDecimal("0.05");//注意构造BigDecimal类时候必须用String类型才能得到精确的值
        BigDecimal b2 = new BigDecimal("0.01");
        BigDecimal b3 = b1.add(b2);
        System.out.println(b3);

    }
}