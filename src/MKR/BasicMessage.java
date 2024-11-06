package MKR;

public class BasicMessage implements Message {
    private String text;

    public BasicMessage(String text) {
        this.text = text;
    }

    @Override
    public String processMessage() {
        return text;
    }
}
