package MKR;

public class CompressDecorator extends MessageDecorator {
    public CompressDecorator(Message message) {
        super(message);
    }

    @Override
    public String processMessage() {
        return compress(super.processMessage());
    }

    private String compress(String text) {
        // Видаляти зайві пробіли з тексту
        return text.replaceAll("\\s+", " ").trim();
    }
}

