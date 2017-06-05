# 基础镜像
FROM gaoyibing111/baseimage_centosjdk8:3

# 维护者信息
MAINTAINER yb Gao <gaoyibing111@126.com>

# springio解释到因为内置到tomcat
VOLUME /tmp

# 将打好的jar 命名为 app.jar 添加到image中
ADD gs-rest-service-0.1.0.jar app.jar

# 容器启动后执行的命令 与CMD的区别是不可以被docker run覆盖
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]