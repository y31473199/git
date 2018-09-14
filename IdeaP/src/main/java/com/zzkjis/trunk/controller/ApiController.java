package com.zzkjis.trunk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {

    @RequestMapping("zzis.html")
    public String zzisIndex(){
        return "zzis";
    }

}
