package MKR;

public class AuthorDecorator extends MessageDecorator {
    private String author;

    public AuthorDecorator(Message message, String author) {
        super(message);
        this.author = author;
    }

    @Override
    public String processMessage() {
        return addAuthor(super.processMessage());
    }

    private String addAuthor(String text) {
        return text + " - " + author;
    }
}

