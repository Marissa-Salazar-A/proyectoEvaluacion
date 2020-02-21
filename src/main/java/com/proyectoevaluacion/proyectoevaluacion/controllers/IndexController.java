package com.proyectoevaluacion.proyectoevaluacion.controllers;

import com.proyectoevaluacion.proyectoevaluacion.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.INDEX)
public class IndexController {

    public static final String INDEX = "";
    @GetMapping(path="")
    public String goIndex(){
        return "index";
    }

}
