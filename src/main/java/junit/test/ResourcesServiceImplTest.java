package junit.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smmall.entity.LogFormMap;
import com.smmall.mapper.base.BaseMapper;


public class ResourcesServiceImplTest {

	@SuppressWarnings({ "resource" })
	//@Test
	public void test() throws Exception {
		        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-*.xml");  
		        BaseMapper bean = (BaseMapper)ctx.getBean("baseMapper");
		        System.out.println( bean.findbyFrist("id","5",LogFormMap.class));
	}

}