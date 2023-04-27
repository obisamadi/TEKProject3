package tek.sqa.framework.tests;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import tek.sqa.framework.base.BaseUITest;
import tek.sqa.framework.config.POMFactory;

public class RetailTest extends BaseUITest {

	@Parameters({ "emailValue", "passwordValue" })
	@Test
	public void endToEndTest(String email, String pass) throws InterruptedException {
		POMFactory factory = POMFactory.getPOMFactory();
		factory.retailPage().clickonSignInOption();
		factory.retailPage().loginToApplication(email, pass);
		click(factory.retailPage().accountOption);

	}
	
	

}
