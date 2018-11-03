第2章 spring boot
1、登录用户
user/1fc03de6-2a42-4cbc-b32d-abcb78502679
2、访问页面
http://localhost:8080/hello
3、新建项目的时候，要启动nexus

端点
1、应用配置（静态报告）
/autoconfig           自动化配置的报告
/beans                获取上下文中所有的bean
/configprops          获取配置属性信息
/env                  环境配置信息
/mappings             spring mvc的路径映射
2、度量指标（动态报告）
/metrics              内存、线程、GC、评估(gauge)、计算等
/health               磁盘空间、集成Mongo/Rabbit/Redis/Solr等
/dump                 (转储)线程信息
/trace                HTTP跟踪信息
3、控制类信息
endpoints.shutdown.enabled=true

