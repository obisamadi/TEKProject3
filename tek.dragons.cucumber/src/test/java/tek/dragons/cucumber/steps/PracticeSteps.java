package tek.dragons.cucumber.steps;
import io.cucumber.java.en.*;

public class PracticeSteps {
	@Given("User is on the homepage")
	public void userIsOnTheHomepage() {

	}
	@When("User click on the login page")
	public void userClickOnTheLoginPage() {

	}
	@When("User click on create new account page")
	public void userClickOnCreateNewAccountPage() {

	}
	//pass test data in method implementation
	@When("User enters user information")
	public void userEntersUserInformation() {

	}
	@When("User click on the create new account button")
	public void userClickOnTheCreateNewAccountButton() {

	}
	@Then("User should be able to see the user account page")
	public void userShouldBeAbleToSeeTheUserAccountPage() {

	}
	@Then("User name and email are displayed on the user account page")
	public void userNameAndEmailAreDisplayedOnTheUserAccountPage() {

	}
	@Then("User should not be able to see the tek retail homepage")
	public void userShouldNotBeAbleToSeeTheTekRetailHomepage() {

	}
	//add code for scenario outline/examples keyword
	@When("User enters user information example {string} and {string} and {string}")
	public void userEntersUserInformationExampleAndAnd(String string, String string2, String string3) {

	}
	//add code for cucumber DataTable list of list
	@When("User enters user information list of list:")
	public void userEntersUserInformationListOfList(io.cucumber.datatable.DataTable dataTable) {


	}
	//add code for cucumber DataTable list of map
	@When("User enters user information list of map:")
	public void userEntersUserInformationListOfMap(io.cucumber.datatable.DataTable dataTable) {

	}
	//add code for json object
	@When("User enters user information json object:")
	public void userEntersUserInformationJsonObject(String docString) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

