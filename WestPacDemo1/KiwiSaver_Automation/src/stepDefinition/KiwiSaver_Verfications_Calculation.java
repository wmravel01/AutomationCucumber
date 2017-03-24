package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kiwisaver_main.BaseTest;

public class KiwiSaver_Verfications_Calculation {

	BaseTest base = new BaseTest();

	@Given("^User navigates to URL$")
	public void user_navigates_to_URL() throws Throwable {

		base.openBrowser();
		System.out.println("Navigation success");
		BaseTest.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^mousehover to Kiwisaver$")
	public void mousehover_to_Kiwisaver() throws Throwable {

		WebElement KiwiSaver = BaseTest.driver.findElement(By.xpath(".//*[@id='ubermenu-section-link-kiwisaver-ps']"));
		Actions Act = new Actions(BaseTest.driver);
		Act.moveToElement(KiwiSaver).perform();
	}

	@Given("^Click on link Kiwisaver_Calculators$")
	public void click_on_link_Kiwisaver_Calculators() throws Throwable {

		BaseTest.driver.findElement(By.xpath(".//*[@id='ubermenu-item-cta-kiwisaver-calculators-ps']")).click();

	}

	@Given("^Click on link Get_here_to_get_started$")
	public void click_on_link_Get_here_to_get_started() throws Throwable {

		BaseTest.driver.findElement(By.xpath(".//*[@id='content-ps']/div[2]/div/section/p[4]/a")).click();
	}

	@Given("^verify title \"([^\"]*)\"$")
	public void verify_title(String cal_Title) throws Throwable {

		String getTitle = BaseTest.driver.findElement(By.xpath(".//*[@id='content-ps']/div/article/div/h1")).getText();
		Assert.assertEquals(cal_Title, getTitle);
		System.out.println("The title " + getTitle + " is verified");
		Boolean bResult = BaseTest.driver.findElement(By.xpath(".//*[@id='content-ps']/div/article/div/h1"))
				.isDisplayed();
		Assert.assertTrue(bResult);
	}

	@Given("^User enter current age \"([^\"]*)\"$")
	public void user_enter_current_age(String currentAge) throws Throwable {

		BaseTest.driver.switchTo().frame(0);
		System.out.println(currentAge);
		BaseTest.driver.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]"
				+ "/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")).clear();
		BaseTest.driver.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]"
				+ "/div[1]/div[1]/div/div[1]/div/div[1]/div/div/input")).sendKeys(currentAge);
	}

	@Given("^select Employment Status \"([^\"]*)\"$")
	public void select_Employment_Status(String arg1) throws Throwable {

		List<WebElement> findElement2 = BaseTest.driver.findElements(By.cssSelector(".control-well"));

		findElement2.get(1).click();
		List<WebElement> findElement3 = BaseTest.driver.findElements(By.cssSelector(".dropdown"));
		List<WebElement> findElements = findElement3.get(0).findElements(By.tagName("li"));
		findElements.get(1).click();

	}

	@Given("^enter salary per year \"([^\"]*)\"$")
	public void enter_salary_per_year(String salary) throws Throwable {

		BaseTest.driver.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[3]"
				+ "/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")).sendKeys(salary);
	}

	@Given("^select KiwiSaver member contribution (\\d+)percent$")
	public void select_KiwiSaver_member_contribution_percent(int arg1) throws Throwable {

		WebElement radioBtn = BaseTest.driver.findElement(By.cssSelector("#radio-option-069"));
		radioBtn.click();
	}

	@Given("^select PIR \"([^\"]*)\"$")
	public void select_PIR(String PIR) throws Throwable {

		/*
		 * List<WebElement> findElement3 =
		 * BaseTest.driver.findElements(By.cssSelector(".control-well"));
		 * 
		 * findElement3.get(4).click(); List<WebElement> findElement4 =
		 * BaseTest.driver.findElements(By.cssSelector(".dropdown"));
		 * List<WebElement> findElements =
		 * findElement4.get(0).findElements(By.tagName("li"));
		 * findElements.get(4).click();
		 */

		System.out.println("The value selected is " + PIR);
	}

	@Given("^enter KiwiSaver balance \"([^\"]*)\"$")
	public void enter_KiwiSaver_balance(String currentksbalance) throws Throwable {

		BaseTest.driver.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[5]/div/div/div"
				+ "/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input")).sendKeys(currentksbalance);

	}

	@Given("^enter voluntary contribution \"([^\"]*)\"$")
	public void enter_voluntary_contribution(String voluntaryContribution) throws Throwable {

		BaseTest.driver
				.findElement(By
						.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div[1]/div/input"))
				.sendKeys(voluntaryContribution);
	}

	@Given("^select frequency \"([^\"]*)\"$")
	public void select_frequency(String voluntaryContribution) throws Throwable {

		BaseTest.driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[8]/div/div/div/div[2]"
				+ "/div[1]/div[1]/div/div/div[1]/div[1]/div/input")).sendKeys(voluntaryContribution);
	}

	@Given("^select risk profile \"([^\"]*)\"$")
	public void select_risk_profile(String arg1) throws Throwable {

		WebElement radioBtn = BaseTest.driver.findElement(By.cssSelector("#radio-option-021"));
		radioBtn.click();

	}

	@Given("^enter saving goals requirement \"([^\"]*)\"$")
	public void enter_saving_goals_requirement(String savingGoalsRequirement) throws Throwable {

		BaseTest.driver
				.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[10]"
						+ "/div/div/div/div[2]/div[1]/div[1]/div/div/div[1]/div/div/input"))
				.sendKeys(savingGoalsRequirement);
	}

	@When("^user click on  button Projection$")
	public void user_click_on_button_Projection() throws Throwable {

		BaseTest.driver.switchTo().defaultContent();
		List<WebElement> findElements2 = BaseTest.driver.findElements(By.tagName("iframe"));
		for (int i = 0; i < findElements2.size();) {
			BaseTest.driver.switchTo().frame(i);
			List<WebElement> findElements = BaseTest.driver
					.findElements(By.cssSelector(".btn.btn-regular.btn-results-reveal.btn-has-chevron"));
			findElements.get(0).click();
			System.out.println(findElements.size());
			System.out.println("Projection button clicked");
			Thread.sleep(5000);
			verify_balance_estimated_amount_at_age_of_Sixtyfive();
			break;

		}

	}

	@Then("^verify balance_estimated_amount at age of Sixtyfive$")
	public void verify_balance_estimated_amount_at_age_of_Sixtyfive() throws Throwable {

		String estimatedKiwiSaverBalanceAtAge65 = BaseTest.driver
				.findElement(By.xpath(".//*[@id='widget']/div/div[1]/div/div[3]/div/div[1]/div[1]/div[1]/span[2]"))
				.getText();
		System.out.println("At age 65, your KiwiSaver balance is estimated to be: " + estimatedKiwiSaverBalanceAtAge65
				+ " is verified.");
		BaseTest.driver.switchTo().defaultContent();
	}

	@Then("^validate current age info icon$")
	public void validate_current_age_info_icon() throws Throwable {

		if (BaseTest.driver.findElement(By.xpath("//div[@help-id='CurrentAge']/button")).isDisplayed()) {
			System.out.println("Current Age help informaiton icon is present");
			BaseTest.driver.findElement(By.xpath("//div[@help-id='CurrentAge']/button")).click();
			if (BaseTest.driver
					.findElement(By
							.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[1]/div[2]/div/p"))
					.isDisplayed()) {
				System.out.println("The help text for Current Age field is present");
			} else {
				System.out.println("The help text for Current Age field is not present");
			}
		}

		else {
			System.out.println("Current Age help informaiton icon is not present");
		}

	}

	@Then("^validate Employment_Status info icon$")
	public void validate_Employment_Status_info_icon() throws Throwable {

		if (BaseTest.driver.findElement(By.xpath("//div[@help-id='EmploymentStatus']/button")).isDisplayed()) {
			System.out.println("EmploymentStatus help informaiton icon is present");
			BaseTest.driver.findElement(By.xpath("//div[@help-id='EmploymentStatus']/button")).click();
			if (BaseTest.driver
					.findElement(By
							.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/p"))
					.isDisplayed()) {
				System.out.println("The help text for EmploymentStatuse field is present");
			} else {
				System.out.println("The help text for EmploymentStatus field is not present");
			}
		}

		else {
			System.out.println("Employment Status help informaiton icon is not present");
		}

	}

	@Then("^validate salary info icon$")
	public void validate_salary_info_icon() throws Throwable {

		if (BaseTest.driver.findElement(By.xpath("//div[@help-id='AnnualIncome']/button")).isDisplayed()) {
			System.out.println("Salary help informaiton icon is present");
			BaseTest.driver.findElement(By.xpath("//div[@help-id='AnnualIncome']/button")).click();
			if (BaseTest.driver
					.findElement(By
							.xpath(".//*[@id='widget']/div/div[1]/div/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div/p"))
					.isDisplayed()) {
				System.out.println("The help text for AnnualIncome field is present");
			} else {
				System.out.println("The help text for AnnualIncome field is not present");
			}
		}

		else {
			System.out.println("AnnualIncome help informaiton icon is not present");
		}

	}

	@Then("^validate KiwiSaver member contribution info icon$")
	public void validate_KiwiSaver_member_contribution_info_icon() throws Throwable {

	}

	@Then("^validate PIR info icon$")
	public void validate_PIR_info_icon() throws Throwable {

	}

	@Then("^validate current balance info icon$")
	public void validate_current_balance_info_icon() throws Throwable {

	}

	@Then("^validate voluntary contribution info icon$")
	public void validate_voluntary_contribution_info_icon() throws Throwable {

	}

	@Then("^validate risk profile info icon$")
	public void validate_risk_profile_info_icon() throws Throwable {

	}

	@Then("^validate saving goal info icon$")
	public void validate_saving_goal_info_icon() throws Throwable {

	}

	@Then("^validate resTotal amount info icon$")
	public void validate_resTotal_amount_info_icon() throws Throwable {

	}

	@Then("^validate resLife expectancy info icon$")
	public void validate_resLife_expectancy_info_icon() throws Throwable {

	}

	@Then("^validate resIndent retirement age info icon$")
	public void validate_resIndent_retirement_age_info_icon() throws Throwable {

	}

	@Then("^validate resApply inflation info icon$")
	public void validate_resApply_inflation_info_icon() throws Throwable {

	}

	@Then("^validate resIncome increase per year info icon$")
	public void validate_resIncome_increase_per_year_info_icon() throws Throwable {

	}

	@Then("^verfiy balance_estimated_amount at age of (\\d+)$")
	public void verfiy_balance_estimated_amount_at_age_of(int arg1) throws Throwable {

	}

	@Then("^verfiy the balance estimated amount at age of (\\d+)$")
	public void verfiy_the_balance_estimated_amount_at_age_of(int arg1) throws Throwable {

	}

}
