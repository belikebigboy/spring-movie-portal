package io.spring.movieportal.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "error";
    }

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    public String getErrorPath() {
        return PATH;
    }
}

