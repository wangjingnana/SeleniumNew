package action;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	@DataProvider(name="add")
	public Object[][] getData(){
		FileDataProvider fdp = new FileDataProvider();
		return fdp.getTestDataByTxt("data/user.txt");
		
	}

}
