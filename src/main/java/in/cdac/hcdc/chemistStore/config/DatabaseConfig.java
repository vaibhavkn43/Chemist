/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.cdac.hcdc.chemistStore.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author Vaibhav
 */
@Configuration
public class DatabaseConfig {
    
    
    public DriverManagerDataSource getDataSource()
    {
        
    DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dmds.setUrl("jdbc:mysql://localhost:3306/chemist");
		dmds.setUsername("root");
		dmds.setPassword("root");

		return dmds;
                
            
    
    }
}
