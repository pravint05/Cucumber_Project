package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class LoginHooks {

//Hooks are useful in projects for object memory release, Garbage collection,database connection terminate
//This hooks are scenario wise execution at the start and end execute.
	@Before
	public void start()
	{
		System.out.println("Process Started");
	}
	
	@After
	public void end()
	{
		System.out.println("Process End");
	}

}
