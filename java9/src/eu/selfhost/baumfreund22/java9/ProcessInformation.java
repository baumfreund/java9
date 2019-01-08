package eu.selfhost.baumfreund22.java9;

import java.util.stream.Collectors;

public class ProcessInformation {

	public static void main(String[] args) {
		
//		Einfacherer Zugriff auf Prozessinformationen
		ProcessHandle.current().pid();
		ProcessHandle.allProcesses().forEach(e -> System.out.println("Prozess: "+e.pid()+", Info: "+e.info().toString()));
		
//		Test
		
		
	}

}
