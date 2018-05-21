package com.xu.test;

import com.xu.service.impl.TaskAsyncImpl;
import com.xu.thread.MyLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author xuhongda on 2018/5/21
 * com.xu.test
 * spring-quartz-task
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring.xml"}) //要声明@EnableASync
public class AsyncTest {
    /*@Autowired
    private TaskAsyncImpl taskAsync;*/
    @Autowired
    private MyLog myLog;
    @Test
    public void test(){
        myLog.a();
      //  taskAsync.doIt();
    }
}
