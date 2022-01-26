---
title: simple-upload-springboot
tags: 
date: 2022-01-26 14:57:01
id: 1643180221753428800
---
# 摘要

参考[整合OSS对象存储](http://www.jayh.club/#/02.PassJava架构篇/12.SpringCloud整合OSS对象存储?id=整合oss对象存储) ，整合阿里云 OSS 服务到 spring boot 

# 环境准备

自行准备下面四个参数：

- accessKeyId
- accessKeySecret
- bucket
- endpoint

# 代码实现

## 创建项目

 [spring initializer](https://start.spring.io/) 创建项目，选择 **2.3.2.RELEASE** 版本（创建完了再改也行）

##  [pom.xml](pom.xml) 

这里使用 spring-cloud-alibaba-dependencies 进行版本管理，2.2.0.RELEASE 版可以，其他版本很多不行，我也不知道为什么。如果需要使用其他版本的 spring-cloud-alibaba-dependencies，那就直接指定 spring-cloud-starter-alicloud-oss 的版本

```xml

    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.2.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```

```xml

        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alicloud-oss</artifactId>
        </dependency>
```

##  [application.yml](src\main\resources\application.yml) 

```yaml
spring:
  cloud:
    alicloud:
      access-key: LTAI5t9Qia5jwRTebHpvaxNm
      secret-key: YfZsyjykY3pNymRlXtvW388Deo47hy
      oss:
        endpoint: oss-cn-beijing.aliyuncs.com
```

##  [SimpleUploadSpringbootApplicationTests.java](src\test\java\com\example\simpleuploadspringboot\SimpleUploadSpringbootApplicationTests.java) 

# 查看上传结果

从 [Bucket 列表](https://oss.console.aliyun.com/bucket) 中进入你文件上传到的 bucket 即可看到你上传的文件



