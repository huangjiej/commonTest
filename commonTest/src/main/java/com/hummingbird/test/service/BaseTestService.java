/**
 * 
 */
package com.hummingbird.test.service;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hummingbird.common.util.SpringBeanUtil;

/**
 * 测试基类
 * @author huangjiej_2
 * 2014年12月2日 上午12:39:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml","classpath:dataSource.xml"}) 
public class BaseTestService  extends AbstractTransactionalJUnit4SpringContextTests {

	@Before
	public void setUp() throws Exception {
		SpringBeanUtil.init(applicationContext);
	}
	

}
