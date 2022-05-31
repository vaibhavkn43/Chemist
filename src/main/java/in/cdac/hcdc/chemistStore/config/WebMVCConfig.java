/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.hcdc.chemistStore.config;

import jdk.jfr.Description;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

/**
 *
 * @author Vaibhav
 */
@Configuration
@ComponentScan(basePackages="in.cdac.hcdc.chemistStore")
@EnableWebMvc
public class WebMVCConfig {
    
    
    
   @Bean
@Description("Thymeleaf Template Resolver")
public SpringResourceTemplateResolver templateResolver() {
      SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
      templateResolver.setPrefix("/WEB-INF/views/");
      templateResolver.setSuffix(".html");
      return templateResolver;
   
}

@Bean
@Description("Thymeleaf Template Engine")
public SpringTemplateEngine templateEngine() {
    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    templateEngine.setTemplateResolver(templateResolver());
    templateEngine.setTemplateEngineMessageSource(messageSource());
    return templateEngine;
}
        
@Bean
@Description("Thymeleaf View Resolver")
public ThymeleafViewResolver viewResolver() {
    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
    viewResolver.setTemplateEngine(templateEngine());
    viewResolver.setOrder(1);
    return viewResolver;
}

@Bean
@Description("Spring Message Resolver")
public ResourceBundleMessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasename("messages");
    return messageSource;
}
}
