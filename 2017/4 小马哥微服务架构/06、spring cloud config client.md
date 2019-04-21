[TOC]



## 1、Spring Cloud 技术体系

### 1. 前提基础：  

1. 构建系统： Maven、Gradle； 
2. 基础框架：Spring Framework，Spring boot

### 2. 功能

1. 分布式配置 (Distributed/ versioned Configuration)  Zookeeper 
2. 服务注册与发现(Service registration and discovery)  dubbo /Eureka
3. 路由(Routing)  Rabbio  ()
4. 服务调用(Service-to-Service calls)  feign  Rabbio
5. 负载均衡(Load Balancing)
6. 短路(Circuit Breakers)
7. 分布式消息(Distributed messgaing)

Springcloud 和dubbo 区别：Springcloud 管理应用，  dubbo管理服务 关注点不同



![springcloud生态项目](assets/springcloud生态项目.png)





### 2、Spring/Spring Boot 事件机制

#### 1、- 观察者模式

1.  发布订阅者模式： 1:N
2.  发布订阅者模式：N:M
3.  

### 2、- 事件/监听模式 

`java.util.EventObject`:对象事件

*   事件对象总是关联着事件源（source）

`java.util.EventListener`: 事件监听接口（标记）



### Spring中的事件

####  Spring 事件/监听

###### - ApplicationEvent ： 应用事件

###### - ApplicationListener： 应用监听器



#### Spring Boot中的核心事件

#### - ApplicationEnvironmentPreparedEvent

#### -ApplicationPreparedEvent

#### -ApplicationStartingEvent

#### -ApplicationReadEvent

#### -ApplicationFailedEvent







##### ConfigFileApplicationListener 

管理配置文件，比如 `application.xml`、`application.yml`等



java SPI：`java.util.ServiceLoader`

spring SPI: 

如何控制顺序：

实现 `order`  以及标记`@Order` 

在Spring中，是数值越小越优先





书籍推荐

翟永超 《Spring Cloud微服务实战》

 



### 3、Bootstrap 配置属性 

### 4、理解Environment端点

.







































