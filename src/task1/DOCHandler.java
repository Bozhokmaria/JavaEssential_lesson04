package task1;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("open doc");
    }

    @Override
    public void create() {
        System.out.println("create doc");
    }

    @Override
    public void change() {
        System.out.println("change doc");
    }

    @Override
    public void save() {
        System.out.println("save doc");
    }
}
