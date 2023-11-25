package mao.poiwordtopdf.utils;


import fr.opensagres.poi.xwpf.converter.pdf.PdfConverter;
import fr.opensagres.poi.xwpf.converter.pdf.PdfOptions;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import java.io.*;


import java.io.*;

/**
 * Project name(项目名称)：poi-word-to-pdf
 * Package(包名): mao.poiwordtopdf.utils
 * Class(类名): DocxToPdfUtils
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/25
 * Time(创建时间)： 19:26
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class DocxToPdfUtils
{
    /**
     * word转pdf
     *
     * @param wordPath word文件路径
     * @param pdfPath  pdf文件路径
     * @throws IOException ioexception
     */
    public static void wordToPDF(String wordPath, String pdfPath) throws IOException
    {
        XWPFDocument xwpfDocument = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try
        {
            inputStream = new FileInputStream(wordPath);
            xwpfDocument = new XWPFDocument(inputStream);
            PdfOptions pdfOptions = PdfOptions.create();
            outputStream = new FileOutputStream(pdfPath);
            PdfConverter.getInstance().convert(xwpfDocument, outputStream, pdfOptions);
        }
        finally
        {
            if (xwpfDocument != null)
            {
                xwpfDocument.close();
            }
            if (inputStream != null)
            {
                inputStream.close();
            }
            if (outputStream != null)
            {
                outputStream.close();
            }
        }
    }
}
