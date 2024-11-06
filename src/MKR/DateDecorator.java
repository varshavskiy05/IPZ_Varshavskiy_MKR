package MKR;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDecorator extends MessageDecorator {
    public DateDecorator(Message message) {
        super(message);
    }

    @Override
    public String processMessage() {
        return addDateTime(super.processMessage());
    }

    private String addDateTime(String text) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateTime = sdf.format(new Date());
        return "[" + dateTime + "] " + text;
    }
}
