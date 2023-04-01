package com.springboot.bean.config;

import com.springboot.IocBean;
import com.springboot.bean.dao.animal.Cat;
import com.springboot.bean.dao.animal.Mouse;
import com.springboot.bean.dao.animal.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import({IocBean.class, MyImportSelector.class})
//@Import(MyImportSelector.class)
@Import(Mouse.class)
public class SpringConfig {
    //@ConditionalOnClass(name = "com.springboot.bean.dao.animal.Mouse")
    @ConditionalOnMissingClass("com.springboot.bean.dao.animal.aMouse")
    //@ConditionalOnNotWebApplication
    @ConditionalOnWebApplication
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
