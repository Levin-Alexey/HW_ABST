package logger;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        String timestamp = LocalDateTime.now().toString();
        System.out.println(" [" + timestamp + "] " + msg);
    }
}
