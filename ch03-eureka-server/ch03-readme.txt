1、配置host文件
sudu vi /etc/hosts

127.0.0.1       peer1
127.0.0.1       peer2

2、启动注册中心服务

java -jar /Users/sunyifeng/IdeaProjects/spring-cloud/ch03-eureka-server/target/ch03-eureka-server-0.0.1-SNAPSHOT.jar to /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch03-eureka-server/0.0.1-SNAPSHOT/ch03-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

java -jar /Users/sunyifeng/IdeaProjects/spring-cloud/ch03-eureka-server/target/ch03-eureka-server-0.0.1-SNAPSHOT.jar to /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch03-eureka-server/0.0.1-SNAPSHOT/ch03-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

3、访问注册中心服务之后，过几十秒才能访问
http://localhost:1111
http://localhost:1112

4、注册服务
java -jar /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch02-spring-boot/0.0.1-SNAPSHOT/ch02-spring-boot-0.0.1-SNAPSHOT.jar --server.port=1211
java -jar /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch02-spring-boot/0.0.1-SNAPSHOT/ch02-spring-boot-0.0.1-SNAPSHOT.jar --server.port=1212