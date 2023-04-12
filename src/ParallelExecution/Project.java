package ParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class Project extends BaseC{

	@Test
	public void createProject() {
		Reporter.log("Create Project",true);
	}
	
	@Test
	public void modifyProject() {
		Reporter.log("Modify Project",true);
	}
}
