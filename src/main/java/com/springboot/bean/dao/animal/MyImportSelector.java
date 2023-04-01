package com.springboot.bean.dao.animal;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        try {
            Class<?> aClass = Class.forName("com.springboot.bean.dao.animal.aMouse");

            if (aClass!=null){
                return new String[]{"com.springboot.bean.dao.animal.Cat"};
            }
        } catch (ClassNotFoundException e) {
            return new String[0];
        }

        return null;
    }
}
