package org.acme.simpleupload;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class SimpleUploadApplicationTests {


    // Endpoint以 华北2（北京） 为例，其它 Region 请按实际情况填写
    String endpoint = "https://oss-cn-beijing.aliyuncs.com";
    // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。
    // 强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录RAM控制台创建RAM账号。
    String accessKeyId = "LTAI5t9Qia5jwRTebHpvaxNm";
    String accessKeySecret = "YfZsyjykY3pNymRlXtvW388Deo47hy";
    String bucketName = "ebook-trading-platform";



    @Test
    public void testOssUPLoad() throws Exception{
        // <yourObjectName>上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        String objectName = "D:\\folder.jpg";

        // 创建OSSClient实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        //以每天一个文件夹保存上传的文件(文件名称自行优化)
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String content = format+"/Hello OSS.jpeg";
        // 上传文件到指定的存储空间（bucketName）并将其保存为指定的文件名称（objectName）。
        ossClient.putObject(bucketName, content, new FileInputStream(objectName));

        // 关闭OSSClient。
        ossClient.shutdown();
    }

}
