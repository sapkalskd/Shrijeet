package com.nt.commens;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PersistanceBeanConfig.class, ServiceBeanConfig.class})
public class AppConfig {

}
