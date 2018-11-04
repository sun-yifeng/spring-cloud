1、配置host文件
sudu vi /etc/hosts

127.0.0.1       peer1
127.0.0.1       peer2

2、启动服务

java -jar /Users/sunyifeng/IdeaProjects/spring-cloud/ch03-eureka-server/target/ch03-eureka-server-0.0.1-SNAPSHOT.jar to /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch03-eureka-server/0.0.1-SNAPSHOT/ch03-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1

java -jar /Users/sunyifeng/IdeaProjects/spring-cloud/ch03-eureka-server/target/ch03-eureka-server-0.0.1-SNAPSHOT.jar to /Users/sunyifeng/.m2/repository/com/sunyf/spring/cloud/ch03-eureka-server/0.0.1-SNAPSHOT/ch03-eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2

3、访问服务，过几十秒才能访问
http://localhost:1111
http://localhost:1112