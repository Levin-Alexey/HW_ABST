package logger;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int count = 0;
    @Override
    public void log(String msg) {
        count++;
        String timestamp = LocalDateTime.now().toString();
        String prefix = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";
        System.out.println(prefix + "#" + count + " [" + timestamp + "] " + msg);
    }
}
