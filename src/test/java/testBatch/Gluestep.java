package testBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepGlue.DriverUtil;

public class Gluestep {
	
	WebDriver driver;
	@Given("User navigating to login page")
	public void user_navigating_to_login_page() {
		driver=DriverUtil.getDriver("Chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		//throw new cucumber.api.PendingException();
	}
	
	@When("User enters {string}  {string}")
	public void user_enters(String string, String string2) {
		// Write code here that turns  the phrase above into concrete actions
		driver.findElement(By .linkText("SignIn")).click();
		driver.findElement(By .name("userName")).sendKeys("admin");
		driver.findElement(By .name("password")).sendKeys("Password456");
		driver.findElement(By .name("Login")).click();
		//throw new cucumber.api.PendingException();
	}
	
	@Then("User gets Registeration successfull")
	public void user_gets_Registeration_successfull() {
		//throw new cucumber.api.PendingException();
		System.out.println("registeration successfull");
	}
	@Given("Admin adding the new category")
	public void admin_adding_the_new_category(io.cucumber.datatable.DataTable datatable) {
	driver.findElement(By .xpath("//h4[text()='Add Category']")).click();	
	}
	
	@When("Admin gives the category name as")
	public void admin_gives_the_category_name_as(io.cucumber.datatable.DataTable datatable) {
		//Write code here that turns the phrase above into concrete actions
		// For automatic transformation,change DataTable to one of
		//E, List<E>, List<List<E>>, List<map<K,V>>, Map<K,V> or
		//Map<K, List<V>>. E,K,v must be a String, Integer, Float,
		//Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		//throw new cucumber.api.PendingException();
		driver.findElement(By .name("catgName")).sendKeys("Sports");
		}
	
	@Then("admin gives category daescription as") 
		public void admin_gives_category_description_as(io.cucumber.datatable.DataTable datable) {
		driver.findElement(By .name("catgDesc")).sendKeys("sports");
		driver.findElement(By .className("input[value='Add']")).click();
	}
	
	@Given("Adding the subcategory under the Sports")
	public void adding_subcategory_under_the_Sports(io.cucumber.datatable.DataTable datatable) {
		//Write code here that runs the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		//Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		//Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		//throw new cucumber.api.PendinException();
		driver.findElement(By .xpath("//h4[text()='Add Sub Category']")).click();
		}
	
	@When("Admin selecting the the category as sports")
	public void admin_selecting_the_category_as_sports() {
		driver.findElement(By .name("catName")).click();
		}
	
	@Then("subcategory names as {string}  {string}")
	public void subcategory_names_as(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
		driver.findElement(By .name("sunCatgDesc")).sendKeys("Basketball");
		driver.findElement(By .name("sunCatgDesc")).sendKeys("Volleyball");
		driver.findElement(By .className("input[value='Add']")).click();
		
	}
}
