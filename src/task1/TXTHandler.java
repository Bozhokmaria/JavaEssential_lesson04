package task1;

public class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("open txt");
    }

    @Override
    public void create() {
        System.out.println("create txt");

    }

    @Override
    public void change() {
        System.out.println("change txt");
    }

    @Override
    public void save() {
        System.out.println("save txt");
    }
}
