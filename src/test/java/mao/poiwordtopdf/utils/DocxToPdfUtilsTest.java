package mao.poiwordtopdf.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：poi-word-to-pdf
 * Package(包名): mao.poiwordtopdf.utils
 * Class(测试类名): DocxToPdfUtilsTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/25
 * Time(创建时间)： 19:36
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

@SpringBootTest
class DocxToPdfUtilsTest
{

    @Test
    void wordToPDF() throws IOException
    {
        DocxToPdfUtils.wordToPDF("./test.docx", "test.pdf");
    }
}
