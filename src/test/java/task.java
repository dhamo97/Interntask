import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Baseclasspom.baseclass;
import Baseclasspom.pom1;
import Baseclasspom.pom2;
import Baseclasspom.pom3;
import Baseclasspom.pom4;

public class task extends baseclass{
	@BeforeTest
private void lanuch() {
	Lanuch("chrome", "https://test-bams.web.app");

}
	@Test(priority = 1)
	private void login() throws InterruptedException {
		Entertext(pom1.username, "test101@gmail.com");
		Entertext(pom1.password, "Test@101");
		click(pom1.submit);
		Thread.sleep(5000);
	}
	@Test(priority = 2)
	private void AnalyticsandReports() throws InterruptedException {
		
		Thread.sleep(3000);
		click(pom2.click1);
		dropdown(pom2.bus, "//li[text()='BUS']");
		dropdown(pom2.class1, "//li[text()='CLASS 2']");
		dropdown(pom2.division, "//li[text()='C']");
		click(pom2.click2);


	}
	@Test(priority = 3)
	private void Addstudentdata() throws InterruptedException {
		click(pom3.click1);
		click(pom3.click2);
		Entertext(pom3.admissionNO, "2468");
		Entertext(pom3.fristname, "Arun");
		Entertext(pom3.lastname, "kumar");
		Entertext(pom3.fathername, "Dhamodharan");
		dropdown(pom3.Class, "//li[text()='CLASS 2']");
		dropdown(pom3.division, "//li[text()='D']");
		dropdown(pom3.gender, "//li[text()='M']");
		Entertext(pom3.mobileNO, "9876543210");
		dropdown(pom3.BusNO, "//li[text()='BUS']");
		Entertext(pom3.DOB, "24-05-2015");
		dropdown(pom3.paymentsatus, "//li[text()='Yes']");
		dropdown(pom3.Registered, "//li[text()='Yes']");
		dropdown(pom3.Area, "//li[text()='ASHRAM']");
		Entertext(pom3.Address, "Bangalore");
		Entertext(pom3.StudentID, "1122");
		dropdown(pom3.Admissionstatus, "//li[text()='Studying']");
		Entertext(pom3.AdmissionDate, "24-05-2021");
		Entertext(pom3.mothername, "kavya");
		Entertext(pom3.mothermobileNO, "1231234564");
		dropdown(pom3.daysscholar, "//li[text()='DaysScholar']");
		click(pom3.click3);
		click(pom3.click4);
		driver.navigate().refresh();
		Thread.sleep(5000);
	
	}
	@Test(priority = 4)
	private void Editdata() {
		click(pom4.click5);
		Entertext(pom4.search, "Arun kumar");
		click(pom4.Admissionno);
		click(pom4.Edit);
		Entertext(pom4.Editadmmission, "1111");
		click(pom4.confrim);

	}
	
}
