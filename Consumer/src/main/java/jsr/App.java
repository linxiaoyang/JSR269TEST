package jsr;

@Data
public class App {
    private String value;

    public static void main(String[] args) {
        App app = new App();
        app.setValue("hello world");
        System.out.println(app.getValue());
    }
}
