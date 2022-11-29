package com.peaksoft.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfing extends
        AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
//    java servlet api
//        деген дагым бир dependency керек
//        DispathcerServlet иштеш учун
//        https://mvnrepository.com/artifact/javax.servlet/
//        javax.servlet-api/4.0.1

