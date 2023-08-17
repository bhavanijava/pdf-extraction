package com.web.PdfExtraction;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testautomationguru.utility.PDFUtil;
//remote change
@SpringBootApplication
public class PdfExtractionApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PdfExtractionApplication.class, args);
		
		
		String folderLocation="D://Extracted Images";
		String pdfLocation="C:/Users/Bhavani sankar/Downloads/PdfFormExample.pdf";
		
		PDFUtil pdfUtil=new PDFUtil();
		
		pdfUtil.setImageDestinationPath(folderLocation);
		pdfUtil.extractImages(pdfLocation);
		
	}

}
