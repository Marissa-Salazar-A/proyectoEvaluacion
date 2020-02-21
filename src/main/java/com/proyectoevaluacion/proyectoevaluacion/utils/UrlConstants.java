package com.proyectoevaluacion.proyectoevaluacion.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.INDEX)
public class UrlConstants {
    public static final String INDEX = "";

    public static final String CLIENTE = "/cliente";
    public static final String CLIENTE_AGREGAR = "/save";
    public static final String CLIENTE_ELIMINAR = "/eliminar";
    public static final String CLIENTE_UPDATE = "/update";
    public static final String Listar = "/listar";

    public String goIndex(){
        return "index";
    }

}
