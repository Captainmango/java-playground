

public class Playground {

    public static void main(String [] args){
        ProcessHandle currentProcess = ProcessHandle.current();
        ProcessHandle.Info currentProcessInfo = currentProcess.info();
        System.out.println("PID: " + currentProcess.pid());
        System.out.println("Info: " + currentProcessInfo);
    }

}
