package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest
{
	@Test
	public void testValidLogin()
	{
			LoginPage l = new LoginPage(driver);
			String un = Lib.getCellValue("ValidLogin", 1, 0);
			l.setUsername(un);
			String pwd = Lib.getCellValue("ValidLogin", 1, 1);
			l.setPassword(pwd);
			l.clickLogin();
	}
}
