# testdubbodemo
整合springMvc+dubbo+zookeeper的一个小demo，纯粹用于学习和记录进度  

总共用到了2台服务器，一台用于搭建zookeeper+dubbo-admin，成为注册中心，另一台上通过maven插件用两个端口分别运行Controller和ServiceImpl。  
代码中，将serviceImpl和testweb分为了两个web项目，二者之间通过zookeeper进行网络通信，提供者serviceImpl提供服务，供消费者testweb进行使用。

### 最后成果图如下：  
![Aaron Swartz](https://raw.githubusercontent.com/Wenwhite/testdubbodemo/master/pic/效果图1.png)  
![Aaron Swartz](https://raw.githubusercontent.com/Wenwhite/testdubbodemo/master/pic/效果图2.png)  
![Aaron Swartz](https://raw.githubusercontent.com/Wenwhite/testdubbodemo/master/pic/效果图3.png)  
  
下一步是将springMVC改成springBoot。
