package MKR;

public class EncDecorator extends MessageDecorator {
    public EncDecorator(Message message) {
        super(message);
    }

    @Override
    public String processMessage() {
        return encrypt(super.processMessage());
    }

    private String encrypt(String text) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char) (c + 1));
        }
        return encrypted.toString();
    }
}