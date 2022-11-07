import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("services")
public class FirstRestApp extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		return new HashSet(Arrays.asList(HelloWorldRestService.class));
	}
}
