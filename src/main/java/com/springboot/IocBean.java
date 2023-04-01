package com.springboot;

import com.springboot.bean.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.springboot.bean")
public class IocBean {
    public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String bean:beanDefinitionNames){
            System.out.println("beans"+bean);
        }
    }
}

/*
class selectImports implements ImportSelector{

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> aClass = Class.forName("com.springboot.bean.dao.animal.aMouse");
            if (aClass!=null){
                return new String[]{"com.springboot.bean.dao.animal.Cat"};
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return new String[0];
    }
}*/
