package cn.com.xuxiaowei.configuration;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.ServletContextAware;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

/**
 * Apache JSF 配置
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
public class MyFacesRiServletContextAware implements ServletContextAware {

    /**
     * 配置参数，暂未使用
     */
    @Override
    public void setServletContext(ServletContext servletContext) {

    }

    /**
     * 配置 JSF 核心 FacesServlet 的映射
     */
    @Bean
    ServletRegistrationBean<FacesServlet> facesServlet() {
        FacesServlet facesServlet = new FacesServlet();
        ServletRegistrationBean<FacesServlet> facesServletRegistrationBean = new ServletRegistrationBean<>(facesServlet, "*.xhtml");
        facesServletRegistrationBean.setLoadOnStartup(1);
        return facesServletRegistrationBean;
    }

}
