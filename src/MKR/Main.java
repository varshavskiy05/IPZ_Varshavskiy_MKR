package MKR;

public class Main {
    public static void main(String[] args) {
        Message message = new BasicMessage("Hello, World!");

        message = new EncDecorator(message);
        System.out.println("Encrypted: " + message.processMessage());

        message = new DateDecorator(message);
        System.out.println("With Date & Time: " + message.processMessage());

        message = new AuthorDecorator(message, "Timur Varsavskiy");
        System.out.println("With Author: " + message.processMessage());

        message = new CompressDecorator(message);
        System.out.println("Compressed: " + message.processMessage());
    }
}

