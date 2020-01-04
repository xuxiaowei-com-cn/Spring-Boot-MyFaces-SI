package cn.com.xuxiaowei;

import org.apache.myfaces.webapp.ManagedBeanDestroyerListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * 程序执行入口
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@SpringBootApplication
public class SpringBootMyFacesSiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyFacesSiApplication.class, args);
    }

    @Configuration
    public class a extends ManagedBeanDestroyerListener {

    }

}
