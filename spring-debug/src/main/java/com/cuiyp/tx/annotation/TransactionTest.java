package com.cuiyp.tx.annotation;

import com.cuiyp.tx.annotation.config.TransactionConfig;
import com.cuiyp.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TransactionConfig.class);
        applicationContext.refresh();
        BookService bean = applicationContext.getBean(BookService.class);
        bean.checkout("zhangsan",1);
        int a =2;
        Integer aa = 2 ;
        aa.equals(bean);
        bean.equals(a);

    }
}
