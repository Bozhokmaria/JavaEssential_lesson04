package task1;

public class XMLHandler extends AbstractHandler {

    @Override
    public void open() {
        System.out.println("open xml");
    }

    @Override
    public void create() {
        System.out.println("create xml");
    }

    @Override
    public void change() {
        System.out.println("change xml");
    }

    @Override
    public void save() {
        System.out.println("save xml");
    }
}
