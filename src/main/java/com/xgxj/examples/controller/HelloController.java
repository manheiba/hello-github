package com.xgxj.examples.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String sayHello(){
      return "hello";
  }
  
  @GetMapping("/hello/feature1")
  public String sayHelloFeature1(){
      return "hello,feature1";
  }
  
  @GetMapping("/hello/feature2")
  public String sayHelloFeature2(){
      return "hello,feature2";
  }
  
  @GetMapping("/hello/feature3")
  public String sayHelloFeature3(){
      return "hello,feature3";
  }
}