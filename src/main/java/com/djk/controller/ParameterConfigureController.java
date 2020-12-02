package com.djk.controller;

import com.djk.dto.ParamConfDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import service.ParamConfigService;

@Controller
public class ParameterConfigureController {
    @Autowired
    private ParamConfigService paramConfigService;

    //接收页面传参
    public String getParam(ParamConfDTO paramConfDTO){
        int i = paramConfigService.insertParamConfig(paramConfDTO);

        return "";
    }
}
