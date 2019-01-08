package eu.selfhost.baumfreund22.java9;

import java.util.stream.Collectors;

public class ProcessInformation {

	public static void main(String[] args) {
		
//		Einfacherer Zugriff auf Prozessinformationen

		ProcessHandle.allProcesses().forEach(e -> System.out.println("Prozess: "+e.pid()+", Info: "+e.info().toString()));
		
		final ProcessHandle current = ProcessHandle.current();
        System.out.println("PID:       " + current.pid());
        System.out.println("Info:      " + current.info());
        System.out.println("Command:   " + current.info().command());
        System.out.println("CPU-Usage: " + current.info().totalCpuDuration());
		
        
//        test
	}

}
