---
title: signature-springboot
tags: 
date: 2022-01-26 15:33:30
id: 1643182410438331000
---
# 摘要

服务端签名后直传 - 后端

# 代码实现

## 创建项目

 [spring initializer](https://start.spring.io/) 创建项目，选择 **2.3.2.RELEASE** 版本（创建完了再改也行），勾选 **Web → Spring Web** 

##  [pom.xml](pom.xml) 

```xml
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alicloud-oss</artifactId>
            <version>2.2.0.RELEASE</version>
        </dependency>
```

##  [application.yml](..\..\simple-upload-springboot\src\main\resources\application.yml) 

##  [OssController.java](src\main\java\com\example\signaturespringboot\controller\OssController.java) 

















