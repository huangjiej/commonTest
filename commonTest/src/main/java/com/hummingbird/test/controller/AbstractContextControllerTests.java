/**
 * 
 */
package com.hummingbird.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

/**
 * controller测试基类
 * @author huangjiej_2
 * 2014年12月3日 下午10:02:29
 */
@WebAppConfiguration  
@ContextConfiguration(locations = { "classpath:dataSource.xml","classpath:applicationContext.xml",    
"classpath:spring-servlet.xml" })  
public class AbstractContextControllerTests {  
  
    @Autowired  
    protected WebApplicationContext wac;  
  
}  
