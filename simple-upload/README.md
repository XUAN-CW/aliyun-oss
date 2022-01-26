---
title: simple-upload
tags: 
date: 2022-01-26 12:21:33
id: 1643170893747588000
---
# 摘要

参考 [简单上传](https://help.aliyun.com/document_detail/84781.html) 、 [阿里云oss文件上传.html](assets\references\阿里云oss文件上传.html) ，使用 spring boot 集成阿里云 OSS 服务

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

```xml
        <dependency>
            <groupId>com.aliyun.oss</groupId>
            <artifactId>aliyun-sdk-oss</artifactId>
            <version>3.8.0</version>
        </dependency>
```

##  [SimpleUploadApplicationTests.java](src\test\java\org\acme\simpleupload\SimpleUploadApplicationTests.java) 

# 查看上传结果

从 [Bucket 列表](https://oss.console.aliyun.com/bucket) 中进入你文件上传到的 bucket 即可看到你上传的文件













