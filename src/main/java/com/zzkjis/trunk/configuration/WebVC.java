package com.zzkjis.trunk.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.File;

@Configuration
public class WebVC extends WebMvcConfigurerAdapter {

    public static final String separator= File.separator;
    /*配置静态路径*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/static/**").addResourceLocations("file:/home/alan/IdeaP/src/main/resources/static/");
        super.addResourceHandlers(registry);
    }
}
