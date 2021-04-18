package com.cuiyp.tx.xml;

import com.cuiyp.selfeditor3.AddressPropertyConfiguration;
import com.cuiyp.selfeditor3.Customer;
import com.cuiyp.tx.xml.service.BookService;
import com.cuiyp.tx.xml.service.BookService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

// 把xml配置的方式准备对象的过程画一个流程图出来
public class TxTest {
    public static void main(String[] args) throws SQLException {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
        ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AddressPropertyConfiguration.class, Customer.class);
        acac.register();
        acac.refresh();
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout("zhangsan",1);
    }
}
