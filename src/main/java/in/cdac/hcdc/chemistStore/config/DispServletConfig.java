/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.hcdc.chemistStore.config;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


/**
 *
 * @author Vaibhav
 */
// web.xml
public class DispServletConfig implements WebApplicationInitializer{
 
@Override
public void onStartup(ServletContext servletContext) throws ServletException {

                AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(WebMVCConfig.class);
		context.setServletContext(servletContext);
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		context.close();

}
    
    
}
