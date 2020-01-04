package cn.com.xuxiaowei.configuration;

import org.apache.myfaces.webapp.StartupServletContextListener;
import org.springframework.context.annotation.Configuration;

/**
 * 配置 Apache MyFaces 监听
 * <p>
 * 必须，不可使用 xml 配置
 * 原因：可能与项目启动加载顺序有关
 * 错误详情：
 * java.lang.IllegalStateException: No Factories configured for this Application. This happens if the faces-initialization does not work at all - make sure that you properly include all configuration settings necessary for a basic faces application and that all the necessary libs are included. Also check the logging output of your web application and your container for any exceptions!
 * If you did that and find nothing, the mistake might be due to the fact that you use some special web-containers which do not support registering context-listeners via TLD files and a context listener is not setup in your web.xml.
 * A typical config looks like this;
 * <listener>
 * <listener-class>org.apache.myfaces.webapp.StartupServletContextListener</listener-class>
 * </listener>
 * ......
 * org.springframework.boot.web.server.WebServerException: Unable to start embedded Tomcat server
 *
 * @author xuxiaowei
 * @since 0.0.1
 */
@Configuration
public class MyFacesRiStartupServletContextListener extends StartupServletContextListener {

}
