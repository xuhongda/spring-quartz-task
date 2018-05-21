package com.xu.service.impl;

import com.xu.service.Task;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 *
 * 异步
 * @author xuhongda on 2018/5/21
 * com.xu.service.impl
 * spring-quartz-task
 */
@Service
public class TaskAsyncImpl implements Task {
    @Async("logExecutor")
    @Override
    public void doIt() {
        System.out.println("异步");
    }
}
