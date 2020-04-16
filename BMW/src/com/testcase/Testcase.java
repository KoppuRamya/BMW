package com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Excel.Excel;
import com.baseclass.WrapperEX;
import com.pages.page;

public class Testcase extends WrapperEX
{
	@BeforeClass
	public void startup()
	{
		Launchapp("chrome","https://www.bmw.in/en/");
	}
	@Test
	public void Search() throws InterruptedException, IOException
	{
		page p=new page(driver);
		Excel ex=new Excel();
		String s=p.clicks();
		ex.write_excel(0,0,s);
	}
	@AfterClass
	public void close() throws IOException, InterruptedException
	{
		screenshot("BMW/Screenshots/screenshot1.png");
		CloseBrowser();
	}
}

