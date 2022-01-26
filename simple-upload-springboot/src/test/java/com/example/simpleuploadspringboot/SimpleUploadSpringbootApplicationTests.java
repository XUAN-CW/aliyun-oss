package com.example.simpleuploadspringboot;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class SimpleUploadSpringbootApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    void testUploadByAlicloudOss() throws FileNotFoundException {
        String bucketName = "ebook-trading-platform";
        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如 abc/efg/123.jpg。
        File uploadFile = new File("C:\\Users\\33719\\Desktop\\test.jpg");

        InputStream inputStream = new FileInputStream(uploadFile);
        ossClient.putObject(bucketName, uploadFile.getName(), inputStream);
        ossClient.shutdown();
    }

}
