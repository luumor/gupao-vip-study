package com.lumor.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: Administrator
 * @Date: 2019/4/14 0014 09:29
 * @Description:
 */
public class SpringEventListenerDemo {


    public static void main(String[] args) {
        // 1. 注册监听器
        //2. 发布事件
        //3. 监听器得到事件


        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();


        annotationConfigApplicationContext.addApplicationListener(new ApplicationListener<MyApplication>() {

            @Override
            public void onApplicationEvent(MyApplication event) {

            }
        });

    }

    private static class MyApplication extends ApplicationEvent{

        /**
         * Create a new ApplicationEvent.
         *
         * @param source the object on which the event initially occurred (never {@code null})
         */
        public MyApplication(Object source) {
            super(source);
        }
    }

}
