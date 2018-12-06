package com.yi.docker.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AppController {
  @RequestMapping("/")
  public String home() {
    return "Hello Docker World";
  }
}
