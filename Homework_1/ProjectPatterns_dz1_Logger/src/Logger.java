import java.time.LocalDateTime;

public class Logger {
    private static Logger instance = null;
    protected int num = 1;

    private Logger() {}

    public void log(String msg) {
        System.out.println("["+ LocalDateTime.now()+ " " + num + "] " + msg);
        num++;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}
